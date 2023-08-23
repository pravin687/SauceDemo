package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.InventoryPage;
import utility.World;

public class InventorySteps {
	public InventoryPage ip;
	public World world;
	
	public InventorySteps(World world) {
		this.world=world;
		this.ip=world.po.getInventoryPage();
	}
	
	
	
	@When("I click on add to cart button for backpack")
	public void i_click_on_add_to_cart_button_for_backpack() {
	    ip.clickOnBackPack();
	}

	@Then("I verify button appears with {string} tag")
	public void i_verify_button_appears_with_tag(String string) {
		Assert.assertEquals(ip.getTextOnBackPackBtn(),string);
	    
	}

}
