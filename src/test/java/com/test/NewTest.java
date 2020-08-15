package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "E:\\tools\\geckodriver.exe");
		driver= new FirefoxDriver();
		System.out.println("opening url");
		driver.get("http://localhost:4200");
		System.out.println("heading to signin");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("clicked");
  }
  
}