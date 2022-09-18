package step_Definition;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Max_Min_PriceCheckBox;

public class Test_definition extends Base{
	
	Max_Min_PriceCheckBox priceUpdate = new Max_Min_PriceCheckBox();
	
	
	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		priceUpdate.test1_URL();
	}

	@Then("Search for Product")
	public void search_for_Product() {
		priceUpdate.sendKeysOnSearchBox();
	}

	@And("Click on Search Btn")
	public void click_on_Search_Btn() {
		priceUpdate.clickOnSearchButton();
	}

	@When("Click for Price")
	public void click_for_Price() {
		priceUpdate.clickOnPrice();
	}

	@Then("Put Min Price")
	public void put_Min_Price() {
		priceUpdate.minPriceBox();
	}

	@And("Put Max Price")
	public void put_Max_Price() {
		priceUpdate.maxPriceBox();
	}

	@Then("We click on Update")
	public void we_click_on_Update() {
		priceUpdate.clickUpdate();
	}

}// class
