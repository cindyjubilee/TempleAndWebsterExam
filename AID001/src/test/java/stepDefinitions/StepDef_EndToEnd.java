package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPages.Page_EndToEnd;

public class StepDef_EndToEnd {
	
	Page_EndToEnd endToEndPages = new Page_EndToEnd();
	
	@Given("^I navigate to TandW website$")
	public void i_navigate_to_tandw_website() throws Exception{ 
		//call methods
		endToEndPages.launchBrowser();
		endToEndPages.navigateToTAndWHomePage();
	}
	
	@And("^the homepage launches$")
	public void the_homepage_launches() throws Exception{ 
		//call methods
		endToEndPages.verifyHomepageLaunched();
	}
	
	@When("^I search for the \"([^\"]*)\" product$")
	public void i_search_for_the_keyword_product(String keyword) throws Exception{ 
		//call methods
		endToEndPages.searchForKeyword(keyword);
	}
	
	@And("^costs less than \"([^\"]*)\" AUD$")
	public void costs_less_than_amount_aud(String maxAmount) throws Exception{ 
		//call methods
		endToEndPages.filterResults(maxAmount);
	}
	
	@Then("^open the product for more details when selected$")
	public void open_the_product_for_more_details_when_selected() throws Exception{ 
		//call methods
		endToEndPages.selectProduct();
	}
	
	@When("^I choose a variant$")
	public void i_choose_a_variant() throws Exception{ 
		//call methods
		endToEndPages.selectProductVariant();
	}
	
	@And("^I select number of items to buy$")
	public void i_select_number_of_items_to_buy() throws Exception{ 
		//call methods
		endToEndPages.selectNumberOfItems();
	}
	
	@And("^click Add to Cart$")
	public void click_add_to_cart() throws Exception{ 
		//call methods	
		endToEndPages.addItemToCart();
	}
					
	@Then("^product is added to my Shopping Cart$")
	public void product_is_added_to_my_shopping_cart() throws Exception{ 
		//call methods
		endToEndPages.verifyCartItems();
	}

			
}
