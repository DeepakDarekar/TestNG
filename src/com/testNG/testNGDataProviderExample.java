package com.testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;

public class testNGDataProviderExample {

	@DataProvider(name = "addMethodDataProvider")
	public Object[][] dataProvider() {
		return new Object[][] { { 2, 5, 7 }, { 3, 7, 10 }, { 4, 5, 9 } };
	}

	@Test(dataProvider = "addMethodDataProvider")
	public void testAddMethod(int a, int b, int result) {
		calculator calculator = new calculator();
		AssertJUnit.assertEquals(calculator.add(a, b), result);
	}

}