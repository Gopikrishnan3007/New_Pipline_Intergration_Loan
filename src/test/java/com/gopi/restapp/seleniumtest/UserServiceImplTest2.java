package com.gopi.restapp.seleniumtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


class UserServiceImplTest2 {
	
	WebDriver webDriver;
	
	@BeforeEach
	void brfore(){
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("http://localhost:3000/");
	}
	
//	@AfterEach
//	void after(){
//		webDriver.quit();
//	}
	
	
	
	
	@Test
	@Order(1)
	void register() {
		webDriver.findElement(By.linkText("Register")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Gopi");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("krishnan");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[3]/input")).sendKeys("Gopi@999");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[4]/input")).sendKeys("Gopi@123");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/center/button")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		
	}

	@Test
	@Order(2)
	void registerFail() {
		webDriver.findElement(By.linkText("Register")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Gopi");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("krishnan");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[3]/input")).sendKeys("Gopi110");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[4]/input")).sendKeys("Gopi@123");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/center/button")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		assertEquals("http://localhost:3000/register",webDriver.getCurrentUrl());
	}
	
	@Test
	@Order(3)
	void login() {
		webDriver.findElement(By.linkText("Login")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("Gopi123");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("Gopi@123");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/center/button")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		
	}
	
	@Test
	@Order(4)
	void loginFail() {
		webDriver.findElement(By.linkText("Login")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("G12");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("678");
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/center/button")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		assertEquals("http://localhost:3000/login",webDriver.getCurrentUrl());
	}
	
	


}
