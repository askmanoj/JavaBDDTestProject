package stepDefPack6;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages6.CustormerDetails;
import pages6.DressSelectPage6;
import pages6.ProceedPage;
import util.TestBase;

public class StefDefClass6 extends TestBase {
	DressSelectPage6 abc;
	ProceedPage abc2;
	CustormerDetails abc3;

	@Given("^user given with URL$")
	public void user_given_with_URL() throws Throwable {
		initialization();
	}

	@When("^entered website dress page$")
	public void entered_website_dress_page() throws Throwable {
		abc = new DressSelectPage6();
		abc.dressSelect();
	}

	@Then("^select particular item with color and size$")
	public void select_particular_item_with_color_and_size() throws Throwable {
		abc.selectColorAndSize();

	}

	@Then("^selete product to the cart$")
	public void selete_product_to_the_cart() throws Throwable {
		abc.productToCart();
	}

	// ProceedPage

	@Given("^selected producted to the cart$")
	public void selected_producted_to_the_cart() throws Throwable {
		abc2 = new ProceedPage();
		abc2.proceedPage();
	}

	@When("^user is on add to cart page$")
	public void user_is_on_add_to_cart_page() throws Throwable {
		// driver.findElement(By.xpath("//a[@class='checkout-button button alt
		// wc-forward']")).click();

	}

	@Then("^click on proceed to check out$")
	public void click_on_proceed_to_check_out() throws Throwable {
		abc2.proceedPage1();
	}

	@Given("^user will navigate to the customer details page$")
	public void user_will_navigate_to_the_customer_details_page() throws Throwable {

	}

	@When("^user is on customer detail page$")
	public void user_is_on_customer_detail_page() throws Throwable {

	}

	@Then("^user enters all the details$")
	public void user_enters_all_the_details() throws Throwable {

	}

	@Given("^user have entered a First Name$")
	public void user_have_entered_a_First_Name() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.firstName();
		

	}

	@Given("^user have entered a Last Name$")
	public void user_have_entered_a_Last_Name() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.LastName();
	}

	@Given("^user selected country from dropdown$")
	public void user_selected_country_from_dropdown() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.selectCountry();
	}

	@Given("^user have entered a complete address$")
	public void user_have_entered_a_complete_address() throws Throwable {
		abc3 = new CustormerDetails(); 
		abc3.address();
	}

	@Given("^user have entered a City$")
	public void user_have_entered_a_City() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.city();
	}

	@Given("^user have entered a Postcode$")
	public void user_have_entered_a_Postcode() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.postCode();
	}

	@Given("^user have entered a Mobile$")
	public void user_have_entered_a_Mobile() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.phoneNumber();
	}

	@Given("^user have entered a Email$")
	public void user_have_entered_a_Email() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.email();
	}

	@Given("^user navigate to check out$")
	public void user_navigate_to_check_out() throws Throwable {

	}

	@When("^user is on checkout page$")
	public void user_is_on_checkout_page() throws Throwable {

	}

	@Then("^user clicks on terms and condition$")
	public void user_clicks_on_terms_and_condition() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.termsNconditions();
	}

	@Then("^user clicks on checkout$")
	public void user_clicks_on_checkout() throws Throwable {
		abc3 = new CustormerDetails();
		abc3.checkOut();
	}
}