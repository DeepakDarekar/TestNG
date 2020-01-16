package com.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class multipleTest {

	public WebDriver driver;

	@Test

	public void One() {

		System.out.println("This is the Test Case number One");
	}

	@Test

	public void Two() {

		System.out.println("This is the Test Case number Two");
	}

	@Test

	public void Three() {

		System.out.println("This is the Test Case number Three");
	}

	@Test

	public void Four() {

		System.out.println("This is the Test Case number Four");
	}

}
