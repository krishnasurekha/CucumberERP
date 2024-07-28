package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CustomerSteps {
	WebDriver driver;

	@Given("^launch browser$")
	public void launch_browser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
	}

	@When("^Launch url \"([^\"]*)\" in a browser$")
	public void launch_url_in_a_browser(String url) throws Throwable {
		FunctionLibrary.openUrl(url);
	}

	@When("^Wait For username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_username_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\"$")
	public void enter_Username_with_and_and(String LocatorType, String LocatorValue, String testData) throws Throwable {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
	}

	@When("^Enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue, String testData) throws Throwable {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
	}

	@When("^click login button	with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_login_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^click customer link	 with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^click Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Add_icon_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for Customer Number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Customer_Number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void capture_customer_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.capurecusnum(LocatorType, LocatorValue);
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String testData, String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, testData);
	}

	@When("^Click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Add_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^click Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Wait for alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("^Click alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_alert_ok_button_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^Validate customer   table$")
	public void validate_customer_table() throws Throwable {
		FunctionLibrary.CustomerTable();
	}

	@When("^Click Logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_Logout_link_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("^close browser$")
	public void close_browser() throws Throwable {
		FunctionLibrary.closeBrowser();
	}

}
