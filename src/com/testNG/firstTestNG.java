package com.testNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class firstTestNG {

	public WebDriver driver;

	@Test

	public void main() {
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xxx");
		driver.findElement(By.xpath("//Input[@value = 'Log In']")).click();
		System.out.println(driver.getTitle());
	}

	@BeforeTest

	public void beforeMethod() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Launch the Online Store Website

		driver.get("http://www.facebook.com");

	}

	@AfterTest

	public void afterMethod() {

		// Close the driver

		driver.quit();

	}

}
