package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fb {
	static int  i=0;
	public static void main(String[] args) throws InterruptedException 

	{
		//		File file = new File("C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		String URL ="https://www.facebook.com/";
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		WebElement month = driver.findElementByXPath("//select[@id='month']");
	      Select dropdown = new Select(month);
	      List<WebElement> options2 = dropdown.getOptions();
	     
	      
	      
	      for (WebElement op : options2) {
	    	  
			if(op.getText().startsWith("J"))
				
			{
				
				i=i+1;
				
		        if(i==3)
		        {
		        	System.out.println(op.getText());
		        	op.click();
		        	break;
		        }
			}
			
				
				
				
		}
	
	
	}
	
}
