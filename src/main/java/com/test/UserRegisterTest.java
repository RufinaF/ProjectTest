package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserRegisterTest {
	
	public WebDriver driver;
	
 /* @Test
  public void f() {
	  
	  System.setProperty("webdriver.gecko.driver", "E:\\tools\\geckodriver.exe");
		driver= new FirefoxDriver();
		System.out.println("opening url");
		driver.get("http://localhost:4200");
  } */
	
	@BeforeTest
	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "E:\\tools\\geckodriver.exe");
		driver= new FirefoxDriver();
		System.out.println("opening url");
		driver.get("http://localhost:4200");
	}
	
	@Test
	public void registration() {
		System.out.println("Entering details...");
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("a");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("1999-09-09");
		driver.findElement(By.xpath("//input[@name='pancard']")).sendKeys("qwer1234ty");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("addressLine1")).sendKeys("22-12");
		driver.findElement(By.id("addressLine2")).sendKeys("atown");
		driver.findElement(By.id("addressLine3")).sendKeys("acity");
		driver.findElement(By.id("addressLine4")).sendKeys("astate");
		driver.findElement(By.id("addressLine5")).sendKeys("629175");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("userName")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc12345");
		driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("abc12345");
		driver.findElement(By.xpath("//input[@name='tnc']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
	}
}
