package test;

import Pages.RegistrationPage;
import utilities.BaseClass;

public class RegistrationPageTestClass {

	public static void main(String[] args) throws Exception {

		RegistrationPage register = new RegistrationPage();
		BaseClass base = new BaseClass();

		base.openUrl();

		register.clickOnRegisterOnHomePage();

		register.verifyThatTheUserIsOnRegistrationPage();

		register.enterFirstName();

		register.enterLastName();

		register.enterAddress();

		register.enterCityName();

		register.enterStateName();

		register.enterZipCode();

		register.enterPhoneNumber();

		register.enterSSN();

		register.enterUserName();

		register.enterPassword();

		register.confirmPassword();
		
		register.clickOnSubmitButton();
		
		register.verifyThatUserRegisteredSuccessfully();

	}

}
