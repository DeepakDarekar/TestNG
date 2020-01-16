package com.testNG;

import java.util.concurrent.TimeUnit;

//TestNG also gives us the power to take decisions in the middle
//of the test run with the help of Asserts
//In selenium there will be many situations in the test 
//where you just like to check the presence of an element
//1) Assert.assertTrue() & Assert.assertFalse() 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Asserts {

	WebDriver driver;

	@Test

	public void f() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");

		// Here driver will try to find out My Account link on the application

		WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));

		// Test will only continue, if the below statement is true

		// This is to check whether the link is displayed or not

		Assert.assertTrue(myAccount.isDisplayed());

		// My Account will be clicked only if the above condition is true

		myAccount.click();

	}

	@Test
	//It also works the same way like assert true and assert fail.
	//It will also stop the execution, if the value is not equal and carry
	//on the execution,if the value is equal.

	public void test() {

		String sValue = "Lakshay Sharma";

		System.out.println(" What is your full name");

		Assert.assertEquals("Lakshay Sharma", sValue);

		System.out.println(sValue);

	}

}