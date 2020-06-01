package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radio {


	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		 driver.findElementById("yes").click();
		 //String radio =driver.findElementByName("news").getText();
		 //System.out.println(radio);
//		 
//		 WebElement radio = driver.findElementByXPath("//input[@name='news']/following::input");
//		 
//		if(radio.isSelected())
//		{
//			System.out.println("The radio button is selected ");
//		}
//		else
//		{
//			System.out.println("The radio button is not selected ");
//		}
		 
		 String text = driver.findElementByXPath("//input[@name='news']/following::input/parent::label").getText();
		
		 System.out.println(text);
		 
		 WebElement age = driver.findElementByXPath("//input[@name='age']/following::input");
	
		 if(age.isSelected())
		 {
			 System.out.println("Age already entered");
		 }
	
		 else
		 {
			 age.click();
		 }
			 
	}
	
	
	
}
