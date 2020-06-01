package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class EditLead {

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
		
		driver.findElementByXPath("//label[contains(text(),'First name:')]/following::input[29]").sendKeys("sakthi");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();
		
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();

		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("TCS");

		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
