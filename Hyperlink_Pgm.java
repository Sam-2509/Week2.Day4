package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink_Pgm {
	public static void main(String[] args) {

		//Setup the WebDriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Maximize the Window
		driver.manage().window().maximize();

		//Load the URL
		driver.navigate().to("https://leafground.com/link.xhtml");

		//Take me to dashboard
		driver.findElement(By.linkText("Go to Dashboard")).click();
		System.out.println("Current Page of the Title is = "+driver.getTitle());
		driver.navigate().back();

		//Find my destination
		System.out.println("My Current URL is = "+driver.getCurrentUrl());

		//Am I broken link?
		driver.findElement(By.linkText("Broken?")).click();
		System.out.println("Broken Link PAge Title is = "+driver.getTitle());
	}

}