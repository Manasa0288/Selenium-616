package com.testsuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("manasa0041@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("8162580041");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	
		
		
		
		
		
	}

}
