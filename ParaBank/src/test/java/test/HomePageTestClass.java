package test;



import Pages.HomePage;
import utilities.BaseClass;

public class HomePageTestClass   {

	


	public static void main(String[] args) throws Exception {
		
		HomePage hp = new HomePage();
		
		BaseClass base = new BaseClass();
		
		base.openUrl();
		hp.verifyThatTheUserIsOnHomePage();
		base.closeBrowser();
		
		

	}

}
