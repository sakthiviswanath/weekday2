package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
		
		driver.findElementByXPath("//a[@onclick='return false;']//span/following::span[2]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("90");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[@class='x-btn-text']/following::button[6]").click();
		
		Thread.sleep(3000);
		
		String LeadID=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").getText();
        System.out.println("LeadID:"+" " +LeadID);

		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
		

		//String LeadID = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		
		
		
		driver.findElementByXPath("//input[@type='text']/following::input[34]").sendKeys(LeadID);
		
		Thread.sleep(3000);

		driver.findElementByXPath("//button[@class='x-btn-text']/following::button[6]").click();
		Thread.sleep(3000);
		
		String V1 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		
		
		String V2="No records to display";
		
		if(V1.equals(V2))
		{
			System.out.println("ID deleted successfully");
		}
		else
		{
		
			System.out.println("ID not deleted successfully");

		}
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		

	}

	
}
