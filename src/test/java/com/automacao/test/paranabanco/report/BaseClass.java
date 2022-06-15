package com.automacao.test.paranabanco.report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public WebDriverWait w;
   
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		w = new WebDriverWait(driver,15);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ExtentManager.setUpReport();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");

	}

	@AfterTest()
	public void fecharObrowser() {
		
		
			driver.quit();
			ExtentManager.fimRelatorio();

	}

}
