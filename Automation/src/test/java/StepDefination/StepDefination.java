package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class StepDefination {

			
		    @Given("^User Is On Netbanking Landing Page$")
		    public void user_is_on_netbanking_landing_page() throws Throwable {
		    	  System.out.println("user_is_on_netbanking_landing_page");
		    }

		    @When("^User login into application with userName and password$")
		    public void user_login_into_application_with_username_and_password() throws Throwable {
		    	  System.out.println("user_is_on_netbanking_landing_page");
		    }

		    @Then("^Homepage is populated$")
		    public void homepage_is_populated() throws Throwable {
		    	  System.out.println("user_is_on_netbanking_landing_page");
		    }

		    @And("^Cards are displayed$")
		    public void cards_are_displayed() throws Throwable {
		    	  System.out.println("user_is_on_netbanking_landing_page");
		    }
		    
		    @Given("^User Is On Bagisto Landing Page$")
			public void User_Is_On_Bagisto_Landing_Page() {
				// ye dusra given h. 1 feature m multiple given,when,and then ho skte h .
				// isi liye hm function m @Given,when and then ka use krte h .
				// is se compiler easily identify kr leta h ki knsa test execute krna h
			}
	
}
