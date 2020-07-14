package com.scb.t24.wrappers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author dineshkumar.rc
 *
 */
public class GenericWrappers {

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	public static String imageFolderName;

	/**
	 * This method will create the image folder
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 */
	public void createFolder() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH_mm_ssa");
		Calendar cal = Calendar.getInstance();
		String path = System.getProperty("user.dir") + "\\target\\log\\genie-report\\image\\";
		imageFolderName = path + dateFormat.format(cal.getTime());
		new File(imageFolderName).mkdirs();
	}

	/**
	 * This method will return the text from the given property file based on
	 * the given field name
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param field
	 * @param fileName
	 * @return
	 */
	public static String getValueFromPropertyFile(String field, String fileName) {
		Properties propertyValue = null;
		try {
			FileInputStream fileLoad = new FileInputStream(fileName);
			propertyValue = new Properties();
			propertyValue.load(fileLoad);
		} catch (Exception e) {
		}

		return propertyValue.getProperty(field);

	}

	/**
	 * This method will retun the field value from the config.propertis file
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param filed
	 * @return
	 */
	public static String getValueFromConfigFile(String filed) {
		// FileInputStream fileLoad = null;
		String data = null;
		try {
			FileInputStream fileLoad = new FileInputStream("./src/test/resource/test-artifactss/Config.Properties");

			Properties propertyValue = new Properties();
			propertyValue.load(fileLoad);
			data = propertyValue.getProperty(filed);
		} catch (Exception e) {
		}

		return data;
	}

	/**
	 * This method will launch the ie Browser
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 */
	public void launchIeBrowser() {
		KillIEDriver();
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// createFolder();

	}

	/**
	 * This method will launch the Firefox Browser
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 */
	public void launchFFrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// createFolder();
	}

	/**
	 * This method will launch the chrome Browser
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 */
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// createFolder();
	}

	public void KillIEDriver() {

		try {
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method will will launch the given url.
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 */
	public void loadURL(String url) {
		driver.get(url);
		// acceptSSLError();
	}

	/**
	 * This method will copy the screenshot to the location and return the
	 * location as string
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @return
	 */
	public static String getScreenShot() {
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH_mm_ssa");
		Calendar cal = Calendar.getInstance();
		String fileName = imageFolderName + "img_" + dateFormat.format(cal.getTime()) + ".png";

		try {
			FileUtils.copyFile(screenShotFile, new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fileName;
	}

	/**
	 * This method will sleep for the given time
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param time
	 */
	public void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method will wait for the visibility of the given webElement
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param ele
	 */
	public void waitForVisibilityOfElement(WebElement ele) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ele));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * This method will wait tile the given given webElement to be clickable
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param ele
	 */
	public void waitForElementToBeClickable(WebElement ele) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * This method will return the By Locator of the given webElement
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param ele
	 * @return
	 */
	public By getLocator(WebElement ele) {

		String ds = ele.toString();
		System.out.println(ds);
		String[] dd = ds.split("->");
		String str = dd[1];
		str = str.substring(0, str.length() - 1);
		System.out.println(str);
		String[] loc = str.split(":");
		By acu = null;
		if (loc[0].contains("xpath")) {
			acu = By.xpath(loc[1].trim());
		} else if (loc[0].contains("name")) {
			acu = By.name(loc[1].trim());
		} else if (loc[0].contains("id")) {
			acu = By.id(loc[1].trim());
		} else if (loc[0].contains("className")) {
			acu = By.className(loc[1].trim());
		}

		return acu;
	}

	/**
	 * This method will wait for the not visible of the webElemet
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param ele
	 */
	public void waitForNotVisible(WebElement ele) {
		By locator = getLocator(ele);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/**
	 * This method will click the using the action class
	 * 
	 * @Author sindu
	 * @Date Feb 18, 2017
	 * @param ele
	 */
	public void actionClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).build().perform();

	}

	public void switchToFrameUsingElement(WebElement ele) {
		driver.switchTo().frame(ele);
		// driver.switchTo().frame(1);

	}

	/**
	 * This method will switch the driver control to the last window
	 * 
	 * @Author Dinesh
	 * @Date Feb 18, 2017
	 * @param windowHandels
	 */
	public void switchToLastWindowWithSSLError() {
		sleep(3000);
		Set<String> windowHandels = driver.getWindowHandles();
		// System.out.println(windowHandels.size());
		for (String winHandel : windowHandels) {
			sleep(1000);
			driver.switchTo().window(winHandel);
		}
		// acceptSSLError();
		// System.out.println(driver.getCurrentUrl()+" "+ driver.getTitle());
	}

	/**
	 * This method will accept the SSL error in the IE browser
	 * 
	 * @Author Dinesh
	 * @Date Feb 18, 2017
	 */
	public void acceptSSLError() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		if(driver.findElements(By.xpath("//a[text()='Continue to this website (not recommended).']")).size()>0)
		driver.findElement(By.xpath("//a[text()='Continue to this website (not recommended).']")).click();
		else
			System.out.println("SSL Error not present");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}

	/**
	 * This method will close all the browser windows
	 * 
	 * @Author Dinesh
	 * @Date Feb 18, 2017
	 */
	public void closeAllBrowser() {
		driver.quit();
	}

	/**
	 * This method will close the last window and switch the driver control to
	 * the previous window
	 * 
	 * @Author Dinesh
	 * @Date Feb 19, 2017
	 * @param homeWindow,allWindows,windowIterator,childWindow
	 */
	public void closeLastBrowserWindow() {
		String windowHandleBefore = driver.getWindowHandle();
		Set<String> windowHandels = driver.getWindowHandles();
		for (String windowHandleAfter : windowHandels) {
			sleep(1000);
			driver.switchTo().window(windowHandleAfter);
		}
		driver.close();
		sleep(2000);
		driver.switchTo().window(windowHandleBefore);
		// System.out.println(driver.getCurrentUrl()+" "+ driver.getTitle());
	}

	/**
	 * This method will maximize the browser window
	 * 
	 * @Author Dinesh
	 * @Date Feb 19, 2017
	 *
	 */
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * This method will explicitly wait for the element to load
	 * 
	 * @Author Dinesh
	 * @Date Feb 19, 2017
	 *
	 */
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// public void WriteTestcaseResults(String Desc,String Flag)
	// {
	// try{
	// if(Desc.equals(""))
	// Desc="Null";
	// else if(Flag.equals(""))
	// Flag="Null";
	// ArrayList<String> DescList=new ArrayList<String>();
	// ArrayList<String> FlagList=new ArrayList<String>();
	//
	// for(int i=0;i<DescList.size();i++)
	// {
	// DescList.add(Desc);
	// FlagList.add(Flag);
	// }
	//
	//
	//
	// }
	//
	// catch(Exception e){
	// System.out.println("e is"+e);
	// }
	//
	//
	// }
	//
	// public void GenerateHTMLReport()
	// {
	// try{
	//
	// File htmlTemplateFile=new
	// File("C:/Users/dineshkumar.rc/Desktop/ResultFolder/template.html");
	// String htmlString=FileUtils.readFileToString(htmlTemplateFile);
	// String title="Test report";
	// //String body="This is Body";
	// String
	// body="<table><tr><td>TestcaseName</td><td>TestcaseDescription</td><td>Timestamp</td></tr>"
	// + "<tr><td>TC1</td><td>TC1 Desc</td><td>22.30.14</td></tr></table>";
	// htmlString=htmlString.replace("$title",title);
	// htmlString=htmlString.replace("$body", body);
	// File newHtmlFile=new
	// File("C:/Users/dineshkumar.rc/Desktop/ResultFolder/template.html");
	// FileUtils.writeStringToFile(newHtmlFile, htmlString);
	// System.out.println("HTML generated");
	// }
	// catch(Exception e){
	// System.out.println("HTML not generated");
	// System.out.println(e);
	//
	// }
	//
	// }
	public static ArrayList<ArrayList<String>> readDataFromCSV(String fileName)
	{
		String line;
		ArrayList<ArrayList<String>> dataTable=new ArrayList<ArrayList<String>>();
		try{
			BufferedReader file=new BufferedReader(new FileReader(new File("./src/test/resources/test-artifacts/"+fileName+".csv")));
			while ((line=file.readLine())!=null)
			{
				ArrayList<String> data=new ArrayList<String>();
				String[] colData=line.split(",",-1);
				for(int i=0;i<colData.length;i++)
				{
					data.add(colData[i]);
				}
				dataTable.add(data);

			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return dataTable;
	}
	
	public String strRandomStringGenerator(int length){
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		return sb.toString();
		
	}
	
}
