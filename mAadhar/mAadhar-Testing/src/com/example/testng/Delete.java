package com.example.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Delete {
	
	WebDriver webdriver = null;
	String URL = "http://localhost:4200/";

	@Test
	public void delete() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/prem/Documents/Softwares/chromedriver");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get(URL);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//button[normalize-space()='Admin LogIn']")).click();
		webdriver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		webdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
		webdriver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		webdriver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
		webdriver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		System.out.println("Deleted Successfully");
	}
}
