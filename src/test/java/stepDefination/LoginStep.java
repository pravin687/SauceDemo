package stepDefination;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import utility.World;



public class LoginStep {
	public LoginPage lp;
	public World world;
	
	public LoginStep(World world) {
		this.world=world;
		this.lp=world.po.getLoginPage();        
	}
	
	
	@Given("I land on the login page")
	public void iLandOnTheLoginPage() throws IOException {
		lp.loginurl();
	}
	
	@When("I enter username and password")
	public void i_enter_username_and_password() {
	lp.setUsername();
	lp.setPassword();
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
	  lp.clickOnLoginBtn();
	}
	@Then("I verify home page")
	public void i_verify_home_page() {
		Assert.assertEquals(lp.homepageurl(),lp.validateHomepageurl());
		
	   
	   
	}



}
