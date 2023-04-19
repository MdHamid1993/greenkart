package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	public WebDriver openChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		return driver;

	}

	public WebDriver openEdge() {

		WebDriverManager.edgedriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		return driver;

	}

	public WebDriver openFirefox() throws InterruptedException {

		Thread.sleep(3000);

		WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		return driver;

	}

}
