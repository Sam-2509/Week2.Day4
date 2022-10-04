package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton_Pgm {
	public static void main(String[] args) throws InterruptedException {

		//Setup the Webdriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Browser Window
		driver.manage().window().maximize();

		//Load the URL
		//driver.get("https://leafground.com/button.xhtml");
		driver.navigate().to("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Your most favorite browser
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']/preceding-sibling::div")).click();
		
		//UnSelectable
		driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).click();
		
		//Find the default select radio button
		String text_Value= driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
		System.out.println("Default Select Radio Button Value is = "+text_Value);
		
		//Select the age group (only if not selected)
		String age_Group = driver.findElement(By.xpath("//label[text()='21-40 Years']")).getText();
		//System.out.println(age_Group);
		if(age_Group.equalsIgnoreCase("21-40 Years")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[@for='j_idt87:age:2']")).click();
		}
		else {
			System.out.println(age_Group);
		}

	}
}