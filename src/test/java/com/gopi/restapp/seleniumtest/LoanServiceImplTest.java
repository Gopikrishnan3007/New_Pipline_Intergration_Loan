package com.gopi.restapp.seleniumtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class LoanServiceImplTest {
	
	WebDriver webDriver;
	
	@BeforeEach
	void brfore(){
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("http://localhost:3000/home1");
	}
	
	@AfterEach
	void after(){
		webDriver.quit();
	}
	
	
	
	
	@Test
	void testAddLoan() {	
		webDriver.findElement(By.linkText("Add Loan")).click();
		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Data added Successfully",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	@Test
	void testAddLoanName() {	
		webDriver.findElement(By.linkText("Add Loan")).click();
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter loan Name !!! ",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	@Test
	void testAddLoanLA() {	
		webDriver.findElement(By.linkText("Add Loan")).click();
		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter loan Amount !!! ",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	@Test
	void testAddLoanPA() {	
		webDriver.findElement(By.linkText("Add Loan")).click();
		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter Principal Amount  !!!",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	@Test
	void testAddLoanIA() {	
		webDriver.findElement(By.linkText("Add Loan")).click();
		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter interest Amount !!!",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
	@Test
	void testViewLoan() {
		webDriver.findElement(By.linkText("View All Loan")).click();
	}
	
//	@Test
//	void testDeleteCustomer() {
//		webDriver.findElement(By.linkText("View All Loan")).click();
//		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[18]/td[6]/button")).click();
//		webDriver.switchTo().alert().accept();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("record has deleted",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}
	@Test
	void testDeleteCustomerCancel() {
		webDriver.findElement(By.linkText("View All Loan")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[3]/td[6]/button")).click();
		webDriver.switchTo().alert().dismiss();
	}
	
	@Test
	void testUpdateLoan(){
		webDriver.findElement(By.linkText("View All Loan")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[9]/td[6]/a")).click();
		webDriver.findElement(By.name("loanName")).clear();
		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
		webDriver.findElement(By.name("loanAmount")).clear();
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("principalAmount")).clear();
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.name("interestAmount")).clear();
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.id("value")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("loan data Updated Successfully",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	@Test
	void testUpdateLoanName(){
		webDriver.findElement(By.linkText("View All Loan")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[1]/td[6]/a")).click();
		webDriver.findElement(By.name("loanName")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		webDriver.findElement(By.name("loanName")).sendKeys(Keys.DELETE);
		webDriver.findElement(By.name("loanAmount")).clear();
		webDriver.findElement(By.name("loanAmount")).sendKeys("12,00,000");
		webDriver.findElement(By.name("principalAmount")).clear();
		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
		webDriver.findElement(By.name("interestAmount")).clear();
		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
		webDriver.findElement(By.id("value")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter loan Name !!! ",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
//	@Test
//	void testUpdateLoanAmount(){
//		webDriver.findElement(By.linkText("View All Loan")).click();
//		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[6]/td[6]/a")).click();
//		webDriver.findElement(By.name("loanName")).clear();
//		webDriver.findElement(By.name("loanName")).sendKeys("HomeLoan");
//		webDriver.findElement(By.name("loanAmount")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		webDriver.findElement(By.name("loanAmount")).sendKeys(Keys.DELETE);
//		webDriver.findElement(By.name("principalAmount")).clear();
//		webDriver.findElement(By.name("principalAmount")).sendKeys("4,00,000");
//		webDriver.findElement(By.name("interestAmount")).clear();
//		webDriver.findElement(By.name("interestAmount")).sendKeys("30,000");
//		webDriver.findElement(By.id("value")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Please enter loan Amount !!! ",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}

	
	


}
