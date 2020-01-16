package com.testNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class parallelTests {

	@Test
	public void getFirefox() {
		System.setProperty("webdriver.geckodriver.driver", "C:/Users/darekdee/Desktop/Selenium 23 Dec/geckodriver.exe");
		//System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	}
}
	/*

	@Test
	public void getChorme() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}

}

*/
// Need to change the few settings in the TestNG File as below

/* 
 * <?xml version="1.0" encoding="UTF-8"?> <!DOCTYPE suite SYSTEM
 * "http://testng.org/testng-1.0.dtd"> <suite
 * name="softwaretestingmaterial"parallel="methods" thread-count="3"> <test
 * name="testngTest"> <classes> <class
 * name="softwareTestingMaterial.ParallelTests" /> </classes> </test> </suite>
 * 
 */

/*
 * Here in the above testng.xml file, I have passed parallel=methods and
 * thread-count=2 at the suite level. I would like to execute selenium scripts
 * in parallel in different threads. Most of the times, these two methods will
 * execute in different threads. Thread Id may vary on every run. Here we are
 * just passing thread count but we are not assigning any thread id, assigning
 * thread id will be taken care by your system processor.
 */
