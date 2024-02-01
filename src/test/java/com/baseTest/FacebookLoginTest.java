package com.baseTest;

import java.io.ObjectInputFilter.Config;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.util1.ReadConfig1;

public class FacebookLoginTest {
		WebDriver dr;
		ReadConfig1 config= new ReadConfig1();
	
	@BeforeTest
	public void setup() {
		dr = new ChromeDriver();
		dr.get();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Test
	public void login() {
		WebElement user = dr.findElement(By.id("username"));
		WebElement pass=dr.findElement(By.id("pass"));
		user.sendKeys();
		pass.sendKeys();
		
		
	}
		
	@AfterTest
	
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		dr.close();
	}

}
