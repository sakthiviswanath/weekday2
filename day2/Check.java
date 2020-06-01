package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElementByXPath("(//div[@class='example']//input)[1]").click();
		WebElement check = driver.findElementByXPath("(//div[@class='example']//input)[6]");
		
		if(check.isSelected())
		{
		    System.out.println("selenium is checked");	
		}
		else
		{
			System.out.println("selenium is not checked");	

		}
		
       driver.findElementByXPath("(//div[@class='example']//input)[8]").click();
       driver.findElementByXPath("(//div[@class='example']//input)[9]").click();
       driver.findElementByXPath("(//div[@class='example']//input)[10]").click();
       driver.findElementByXPath("(//div[@class='example']//input)[11]").click();
       driver.findElementByXPath("(//div[@class='example']//input)[12]").click();
       driver.findElementByXPath("(//div[@class='example']//input)[13]").click();
	}

}
