package test_Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/featuredemos", glue={"step_definition"},
//tags={"@Add_to_cart"}
tags={"@Successful_login,@Unsuccessful_login"})
//tags={"@Successful_Registration,@first_name_field_validation,@last_name_field_validation,@email_field_validation,@password_field_validation,@confirm_password_field_validation"})
public class Test_runner_cucumber extends AbstractTestNGCucumberTests{

 

}
 


