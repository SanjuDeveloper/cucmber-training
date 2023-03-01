package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.*;
import io.cucumber.datatable.DataTable;

import java.util.List;

import io.cucumber.java.en.And;

public class stepDefination<Datatable> {

			
		    @Given("^User Is On Netbanking Landing Page$")
		    public void user_is_on_netbanking_landing_page() throws Throwable {
		    	  System.out.println("user_is_on_netbanking_landing_page");
		    }

		    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
		    public void user_login_into_application_with_something_and_something(String userName, String password) throws Throwable {
		    	System.out.println("userName is : "+ userName +" And Password is : "+ password);
		    }

		    @Then("^Homepage is populated$")
		    public void homepage_is_populated() throws Throwable {
		    	  System.out.println("homepage_is_populated");
		    }

		    @And("^Cards displayed \"([^\"]*)\"$")
		    public void cards_displayed_something(String isDisplay) throws Throwable {
		    	System.out.println("Cards displayed : "+ isDisplay);
		    }
		    
		    
		    @When("^User signup into application with details$")
		    public void user_signup_into_application_with_details(DataTable  signUppData) throws Throwable {
		    	 List<List<String>> obj =  signUppData.asLists();
		    	 System.out.println(obj.get(0).get(1));
		    	 System.out.println(obj.get(0).get(2));
		    	 System.out.println(obj.get(0).get(3));
		    }
		    
		    @When("^User log in to application with (.+) and (.+)$")
		    public void user_log_in_to_application_with_and(String username, String password) throws Throwable {
		       System.out.println("UserName of Datable is : "+username+ "And password is "+ password);
		    }
		    
		    @Given("^User Is On Bagisto Landing Page$")
			public void User_Is_On_Bagisto_Landing_Page() {
				// ye dusra given h. 1 feature m multiple given,when,and then ho skte h .
				// isi liye hm function m @Given,when and then ka use krte h .
				// is se compiler easily identify kr leta h ki knsa test execute krna h
			}
		    
		    @Given("^Validate browser$")
		    public void validate_browser() throws Throwable {
		    	System.out.println("validate_browser");
		    }

		    @When("^Browser is triggered$")
		    public void browser_is_triggered() throws Throwable {
		    	System.out.println("browser_is_triggered");
		    }

		    @Then("^Check if browser is opened$")
		    public void check_if_browser_is_opened() throws Throwable {
		    	 System.out.println("check_if_browser_is_opened");
		    }
	
}
