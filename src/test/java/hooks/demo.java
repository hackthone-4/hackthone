package hooks;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class demo {

	@Before(order=1)
	public void setup_positive(Scenario sc){
		System.out.println("launch");
		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void setup_negative(Scenario sc){
		System.out.println("launch");
		System.out.println(sc.getName());
	}
	
	/*@After(order=1)
	public void screenshot(ITestResult result){
		
	WebDriver driver;
		System.out.println("screenshot");
		if(ITestResult.FAILURE==result.getStatus())
		{
		try 
		{
		// Create refernce of TakesScreenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
		// Call method to capture screenshot
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		// Copy method  specific location here it will save all screenshot in our project home directory and
		// result.getName() will return name of test case so that screenshot name will be same
		try{
		FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
		System.out.println("Screenshot taken");
		
		} 
		catch (Exception e)
		{
		System.out.println("Exception while taking screenshot "+e.getMessage());
		} 
		}
		}
	}*/
	
	@After(order=2)
	public void logout(){
		System.out.println("close");
	}
	
	@After(order=3)
	public void close(){
		System.out.println(" logout and close");
	}
	
	
}
