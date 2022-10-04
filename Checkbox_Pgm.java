package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_Pgm {
	public static void main(String[] args) throws InterruptedException {

		//Setup the Webdriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Browser Window
		driver.manage().window().maximize();

		//Load the URL
		//driver.get("https://leafground.com/button.xhtml");
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Basic Checkbox
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

		//Notification
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();

		//Choose your favorite language(s)
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();

		//Tri State Checkbox
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-closethick']")).click();

		//Toggle Switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		//Verify if check box is disabled
		boolean checkbx_Enabled = driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt102']//div)[2]")).isEnabled();
		System.out.println("Mentioned Checkbox is Enabled? = "+checkbx_Enabled);

	}

}
