package com.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedTest1 {
	@Parameters({ "myName" })
	@Test
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
}