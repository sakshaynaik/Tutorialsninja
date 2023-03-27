package com.tutorialsninja.stepdefination;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import com.tutorialsninja.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ReadConfig config = new ReadConfig();
	String browser = config.getBrowser();
	String URL = config.getURL();

	public static WebDriver driver;
	public static SoftAssert asert;
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());
	

	public void setBrowserAndNavigateToWebPage() {

		switch (browser.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;
			break;

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(URL);
	}

	public void quitBrowser() {

		driver.quit();
	}

	// Capture The Failed Testcases Screenshot
	public void captureScreenshot(WebDriver driver, String testname) {

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			String scrnpath = System.getProperty("user.dir") + "//screenshots//" + testname + ".png";
			FileUtils.copyFile(screenshot, new File(scrnpath));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Get Random String Data
	public String getRandomStringValue(int number) {

		return (RandomStringUtils.randomAlphabetic(number));
	}

	// Get Random String Numeric Data
	public String getRandomStringNumericValue(int number) {

		return (RandomStringUtils.randomNumeric(number));
	}

	// Get Random Integer Value
	public int getRandomIntValue(int number) {

		Random random = new Random();
		return (random.nextInt(number));
	}

	// Set The Browser By Excel
	public void setBrowser(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			driver = null;
			break;

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(URL);
	}
}
