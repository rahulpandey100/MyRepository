package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public BaseClass() {
		
	}
	
	static WebDriver driver;
	
	public void openUrl() throws Exception {

		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+ "\\src/main/resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
public boolean IsDisplayed(By locator) throws Exception {
		
	/*WebDriverWait wt = new WebDriverWait(driver,2);
	wt.until(ExpectedConditions.visibilityOfElementLocated(locator));*/
	
		return true;
		
	}

public void closeBrowser() {
	driver.close();
}

public void click(By locator)throws Exception {
	driver.findElement(locator).click();
}

public String sendKeys(By locator,String a)throws Exception{
	driver.findElement(locator).sendKeys(a);
	return a;
}
}
