package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/Features",
		glue ="stepDefinations",
		tags="@regassion and @smoke",
		stepNotifications=true
	)
public class TestRunner {

}

//@RunWith =: Ise lgane se hm testRunner file ko run kr skte h.
// glue =: Stepdefination file ka path
//features =:Feature file ka path 
//tags="@regassion and @smoke", mtlb feature file m jis senario m @regassion tag hoa vo hi run hoga.