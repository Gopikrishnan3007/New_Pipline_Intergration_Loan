package com.gopi.restapp.seleniumtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class CustomerServiceImplTest {
	
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
	@Order(1)
	void testAddCustomer() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Data added Successfully",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
	@Test
	@Order(2)
	void testAddCustomerName() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter Customer Name !!! ",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
	@Test
	@Order(3)
	void testAddCustomerAddress() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter Customer Address  !!! ",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
	@Test
	@Order(4)
	void testAddCustomerMobileNo() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter Customer Mobile Number  !!!",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
	@Test
	@Order(5)
	void testAddCustomerDate() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please Select Date  !!!",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}

	@Test
	@Order(6)
	void testAddCustomerAccountNO() {	
		webDriver.findElement(By.linkText("Add Customer")).click();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("loanId")).sendKeys("3");
		webDriver.findElement(By.className("btn-primary")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("Please enter Account Number  !!!",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	


	
	@Test
	@Order(7)
	void testViewCustomer() {
		webDriver.findElement(By.linkText("View Customer Data")).click();
	}
	
	
//	@Test
//	@Order(8)
//	void testDeleteCustomer() {
//		webDriver.findElement(By.linkText("View Customer Data")).click();
//		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[1]/td[8]/button")).click();
//		webDriver.switchTo().alert().accept();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("record has deleted",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}
	
	@Test
	@Order(9)
	void testDeleteCustomerCancel() {
		webDriver.findElement(By.linkText("View Customer Data")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[1]/td[8]/button")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		webDriver.switchTo().alert().dismiss();
	}
	
	@Test
	@Order(10)
	void testUpdateCustomer(){
		webDriver.findElement(By.linkText("View Customer Data")).click();
		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[7]/td[8]/a")).click();
		webDriver.findElement(By.name("customerName")).clear();
		webDriver.findElement(By.name("customerName")).sendKeys("Gopi");
		webDriver.findElement(By.name("customerAddress")).clear();
		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
		webDriver.findElement(By.name("customerMobileNo")).clear();
		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
		webDriver.findElement(By.name("date")).clear();
		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
		webDriver.findElement(By.name("accountNumber")).clear();
		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
		webDriver.findElement(By.id("value")).submit();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		assertEquals("customer Updated Successfully",webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
	}
	
//	@Test
//	@Order(11)
//	void testUpdateCustomerName(){
//		webDriver.findElement(By.linkText("View Customer Data")).click();
//		webDriver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/table/tbody/tr[2]/td[8]/a")).click();
//		webDriver.findElement(By.name("customerName")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
//		webDriver.findElement(By.name("customerName")).sendKeys(Keys.DELETE);
//		webDriver.findElement(By.name("customerAddress")).clear();
//		webDriver.findElement(By.name("customerAddress")).sendKeys("VNR");
//		webDriver.findElement(By.name("customerMobileNo")).clear();
//		webDriver.findElement(By.name("customerMobileNo")).sendKeys("1234567890");
//		webDriver.findElement(By.name("date")).clear();
//		webDriver.findElement(By.name("date")).sendKeys("12-03-2024");
//		webDriver.findElement(By.name("accountNumber")).clear();
//		webDriver.findElement(By.name("accountNumber")).sendKeys("5687753768759");
//		webDriver.findElement(By.id("value")).submit();
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		assertEquals("Please enter Customer Name !!! ",webDriver.switchTo().alert().getText());
//		webDriver.switchTo().alert().accept();
//	}
	
	


}
