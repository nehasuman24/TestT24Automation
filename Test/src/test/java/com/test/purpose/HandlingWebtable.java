package com.test.purpose;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWebtable {

	@Test
	
	public void webtable() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","E:\\T24AutomationSample\\Test\\src\\test\\resources\\Driver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("http://demo.automationtesting.in/WebTable.html");
	      Thread.sleep(1000);
	     try {
	    	//Scenario 1: Get Column headers
	    /*  WebElement table= driver.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']"));
	      if (table != null) {
	    	  List<WebElement> column=driver.findElements(By.xpath("//div[@class='ui-grid-contents-wrapper']//span[contains(@id,'-header-text')]"));
	    	  System.out.println(column.size());
	    	  for(WebElement ColmnHeader: column) {
	    		 String allHeaders=ColmnHeader.getText();
	    		 System.out.println(allHeaders);
	    		 if(allHeaders.contains("Email")) {
	    			 System.out.println("Correct flow");
	    		 }
	    	  }
	      }*/
	    	//Scenario2: Get the row
	    	/*List<WebElement> rows =  driver.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']"));
	    	System.out.println(rows.size());*/
	    	// Scenario 3Find the Sp value
	    	 
	    	 List<WebElement> allrows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
	    	 for(int i=2;i<allrows.size();i++)
	    	 {
	    	      WebElement authorColumn=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]"));
	    	      if(authorColumn.getText().toLowerCase().equalsIgnoreCase("Mukesh"))
	    	      {
	    	 	WebElement bookNameColumns=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
	    	 	System.out.println(bookNameColumns.getText());
	    	      }	      driver.quit();
	      
	    	 }
	     }catch(Exception e) {
	    	  System.out.println("exception occurs");
	      }
		
	      
	
		
	}
	}

