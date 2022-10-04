package week2.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_Pgm {
	public static void main(String[] args) {

		//Setup the WebDriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Browser Window
		driver.manage().window().maximize();

		//Load the URL
		driver.navigate().to("https://leafground.com/button.xhtml");

		//Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("Title of the Current Page = "+driver.getTitle());
		driver.navigate().back();

		//Confirm if the button is disabled
		boolean result = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println("The Button is Disabled? = "+result);

		//Find the position of the Submit button
		WebElement button_Position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point xy_Position = button_Position.getLocation();
		int x = xy_Position.getX();
		int y = xy_Position.getY();
		System.out.println("This Button X Position is = "+x+" & Y Position is = "+y);

		//Find the Save button color
		String color_Value = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println("Given Button Color is = "+color_Value);

		//Find the height and width of this button
		WebElement button_Size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		int height = button_Size.getSize().getHeight();
		int width = button_Size.getSize().getWidth();
		System.out.println("This Button Height is = "+height+" & Width is = "+width);
	}
}