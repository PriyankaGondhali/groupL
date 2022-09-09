package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Pagelayer.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver Driver;
	@Test()
	
	public void setup() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirt" +Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(o, 600)");
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		//Thread.sleep(2000);
		WebElement shirt=	driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]"));
		shirt.click();















	}}
