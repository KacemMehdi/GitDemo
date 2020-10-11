package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class StepsDefinition {

		@Given("User is on NetBanking landing page")
		public void user_is_on_net_banking_landing_page() throws Throwable
		{
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Test coding in given bloc");
		}



		@When("User login into application with username {string} and password {string}") 
		public void user_login_into_application_with_username_and_password(String string,String string2) throws Throwable
		{
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Test coding in when bloc "+string+" "+string2);

		}
		@Then("Home page is populated")
		public void home_page_is_populated() throws Throwable
		{
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Test coding in then bloc");

		}
		@And("Cards are displayed {string}")
		public void cards_are_displayed(String display) throws Throwable
		{
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Test coding in AND bloc wherer "+display);

		}
		



	
}
