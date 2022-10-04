package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Pgm {
	public static void main(String[] args) throws InterruptedException {

		//Setup the Webdriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Browser Window
		driver.manage().window().maximize();

		//Load the URL
		//driver.get("https://leafground.com/button.xhtml");
		driver.navigate().to("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Which is your favorite UI Automation tool?
		WebElement select_Tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select st = new Select(select_Tool);
		st.selectByIndex(1);

		//Choose your preferred country
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();

		//Confirm Cities belongs to Country is loaded
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		//Choose the Course
		//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		driver.findElement(By.id("j_idt87:auto-complete_input")).sendKeys("Selenium WebDriver");
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[2]")).click();

		//Choose language randomly
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();

		//Select 'Two' irrespective of the language chosen
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt87:value_label")).click();
		//driver.findElement(By.id("j_idt87:value_1")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_1']")).click();

	}

}