package com.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("manasa0041@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		Thread.sleep(5000L);
		driver.navigate().back();
		Thread.sleep(5000L);
		driver.navigate().forward();
		Thread.sleep(5000L);
		driver.quit();
		
		

	}

}
