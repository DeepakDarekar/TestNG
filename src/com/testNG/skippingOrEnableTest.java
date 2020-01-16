package com.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class skippingOrEnableTest {

	public WebDriver driver;

	@Test(priority = 0)

	public void One() {

		System.out.println("This is the Test Case number One");
	}

	@Test(priority = 1)

	public void Two() {

		System.out.println("This is the Test Case number Two");
	}

	@Test(priority = 2, enabled = false)//It will not Execute this Method

	public void Three() {

		System.out.println("This is the Test Case number Three");
	}

	@Test(priority = 3)

	public void Four() {

		System.out.println("This is the Test Case number Four");
	}

}
