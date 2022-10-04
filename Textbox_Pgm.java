package week2.day4;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox_Pgm {
	public static void main(String[] args) {

		//Setup the WebDriver
		WebDriverManager.chromedriver().setup();

		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Browser Window
		driver.manage().window().maximize();

		//Load the URL
		driver.navigate().to("https://leafground.com/input.xhtml");

		//Type your name
		driver.findElement(By.id("j_idt88:name")).sendKeys("Karuppasamy.G");

		//Append Country to this City
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" , Tambaram");

		//Verify if text box is disabled
		boolean textbox_Result = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println("Mentioned Textbox is Enabled? = "+textbox_Result);

		//Clear the typed text
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		//Retrieve the typed text
		String typed_Text = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("Retrieve the Typed Text is = "+typed_Text);

		//Type email and Tab. Confirm control moved to next element
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("test123@abc.com", Keys.TAB);

		//Type about yourself
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am a Automation Testing Engineer");

		//Text Editor
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Just for Testing");

		//Just Press Enter and confirm error message*
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys("", Keys.ENTER);
		String return_text = driver.findElement(By.id("j_idt106:thisform:j_idt110_error-detail")).getText();
		if(return_text.equals("Age is mandatory")) {
			System.out.println("String is Valid");
		}
		else {
			System.out.println("String is Invalid");
		}
	}
}