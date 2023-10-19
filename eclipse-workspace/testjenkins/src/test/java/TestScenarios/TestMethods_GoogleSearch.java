package TestScenarios;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import objects.GoogleSearch;
import objects.GoogleSearch.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {

	public static WebDriver driver;

	@BeforeTest
	public void beforeTest() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\testjenkins\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

	}

	@Test
	public void searchOperation() throws InterruptedException {

		GoogleSearch google = new GoogleSearch(driver);
		google.searchGoogle("Selenium");
		Thread.sleep(2000);
		google.clickSearchByXpath();
		Thread.sleep(2000);
		

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
