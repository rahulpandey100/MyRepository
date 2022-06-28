package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utilities.BaseClass;





public class HomePage extends BaseClass {

	
	
	 By logo = By.xpath("[//img[@class='logo']");

	


	

	public HomePage() {
		
	}




	
	public boolean verifyThatTheUserIsOnHomePage() throws Exception {

	   Assert.assertTrue((IsDisplayed(logo)), "Logo not Present");
	return true;
	   
	   
	}





	




	
	}
	
