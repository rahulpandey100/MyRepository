package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import utilities.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() {

	}

	By register = By.xpath("//div//a[text()='Register']");
	By registerPageTitle = By.xpath("//h1[text()='Signing up is easy!']");
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");
	By zipCode = By.id("customer.address.zipCode");
	By phoneNumber = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By userName = By.id("customer.username");
	By password = By.id("customer.password");
	By confirm = By.id("repeatedPassword");
	By submitButton = By.xpath("(//input[@type='submit'])[2]");
	By registeredSuccessfully = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");

	public void clickOnRegisterOnHomePage() throws Exception {

		click(register);

	}

	public boolean verifyThatTheUserIsOnRegistrationPage() throws Exception {
		Assert.assertTrue(IsDisplayed(registerPageTitle), "Title Not Displayed");
		return true;

	}
	
	public void enterFirstName() throws Exception {
		sendKeys(firstName,"abc");
	}
	
	public void enterLastName() throws Exception {
		sendKeys(lastName,"def");
	}
	
	public void enterAddress() throws Exception {
		sendKeys(address,"New York City");
	}
	
	public void enterCityName() throws Exception {
		sendKeys(city,"NYC");
	}
	
	public void enterStateName() throws Exception {
		sendKeys(state,"USA");
	}
	
	public void enterZipCode() throws Exception {
		sendKeys(zipCode,"123456");
	}
	
	public void enterPhoneNumber() throws Exception {
		sendKeys(phoneNumber,"1234567890");
	}
	
	public void enterSSN() throws Exception {
		sendKeys(ssn,"1234");
	}
	
	public void enterUserName() throws Exception {
		sendKeys(userName,"parabank123");
	}
	
	public void enterPassword() throws Exception {
		sendKeys(password,"qwert@123");
	}
	
	public void confirmPassword() throws Exception {
		sendKeys(confirm,"qwert@123");
	}
	
	public void clickOnSubmitButton() throws Exception {
		click(submitButton);
	}
	
	public void verifyThatUserRegisteredSuccessfully() throws Exception {
		Assert.assertTrue(IsDisplayed(registeredSuccessfully), "Registration Failed");
		
	}
}
