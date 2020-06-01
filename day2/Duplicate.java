package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Duplicate {

	
	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options = new ChromeOptions();
		
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userName = driver.findElementByXPath("//input[@id='username']");
		userName.sendKeys("demosalesmanager");	
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@for='crmsfa']/a").click();
		driver.findElementByXPath("(//div[@class='x-panel-header']/a)[2]").click();
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		
		Thread.sleep(3000);
	
		driver.findElementByXPath("//a[@onclick='return false;']//span/following::span[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
		driver.findElementByXPath("//button[@class='x-btn-text']/following::button[6]").click();
		
		Thread.sleep(3000);
		
		String text1 = driver.findElementByXPath("//div[@unselectable='on']/following::a[25]").getText();
		
		System.out.println("Text1:"+ " "+ text1);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
		driver.findElementByXPath("//a[@class='subMenuButton']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Duplicate Lead"))
		{
			System.out.println("The title contains Duplicate Lead");
		}
		else
		{
			System.out.println("The title contains no Duplicate Lead");
		}
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		String text2 = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
	
		System.out.println("Text2:"+ " "+ text2);
		
		if(text1.equals(text2))
		{
			System.out.println("Duplicated lead name is same as captured name");
		}
		else
		{
			System.out.println("Duplicated lead name is not same as captured name");
		}
		
		driver.close();
	}
	
	

}
