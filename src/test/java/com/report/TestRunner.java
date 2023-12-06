package com.report;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {

	@Test
	public void tc_01() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe\\");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		//driver=new ChromeDriver(options);
		driver.get("https://mohitkumar3019.graphy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String actualHeader=driver.findElement(By.xpath("//a[contains(text(),'Login')]")).getText();
		System.out.println("actualHeader:::" + actualHeader);
		String expectedHeader="Login";
		Assert.assertEquals(actualHeader,expectedHeader);
	}
	
	@Test
	public void tc_02() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe\\");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		//driver=new ChromeDriver(options);
		driver.get("https://mohitkumar3019.graphy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String actualHeader=driver.findElement(By.xpath("//h3[normalize-space()='Mohit TechHub']")).getText();
		System.out.println("actualHeader:::" + actualHeader);
		String expectedHeader="MOHIT TECHHUB";
		Assert.assertEquals(actualHeader,expectedHeader);
	}


}
