package cucumberOptions;



import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@CucumberOptions (  
	    features = {"src/test/java/features"},
	    glue={"stepDefinations"}
	   // plugin={"pretty"}
		)




/*public class TestRunner{}*/
public class TestRunner extends AbstractTestNGCucumberTests {
	
	/*@Override
    @DataProvider(parallel = true)
    public Object[][] features() {
        return super.features();
    }*/
}