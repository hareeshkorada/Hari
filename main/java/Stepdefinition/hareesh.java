package Stepdefinition;
import com.standardchartered.genie.model.GenieScenario;

import cucumber.api.java.en.Given;
import po.GeniePropertyFile;
import po.Test;
public class hareesh {
	public GenieScenario genieScenario;

	@Given("^Customer opens the SCB internet Banking website$")
	public void customer_opens_the_SCB_internet_Banking_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		GeniePropertyFile a=new GeniePropertyFile(genieScenario);
		System.out.println(a.propertyMethod("projectName"));
       System.out.println("This is cucumber class");
       
       po.Test.display();

}

}
