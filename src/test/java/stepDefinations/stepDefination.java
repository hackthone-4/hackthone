package stepDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hackthone.hackthone4.Login;
import resources.base;


public class stepDefination extends base{
	private static Logger log=LogManager.getLogger(base.class.getName());

 
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	        driver=intializeDriver();
	        log.info("browser launch");
	    }

	    @Then("^click signin$")
	    public void click_signin() throws Throwable {
	      Login l=new Login(driver);
	      l.getPopUp().click();
	      Thread.sleep(10000);
	     Actions act=new Actions(driver);
	      
	   /*  l.getl().click();
	      l.sign_in().click();
	      Thread.sleep(3000);
	     File src=new File("C:\\Users\\vighnharta\\Documents\\cucumber.xlsx");
			FileInputStream input=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(input);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			String uname=	sheet.getRow(1).getCell(0).getStringCellValue();
	       l.entername().sendKeys(uname);
	       String pass=	sheet.getRow(1).getCell(1).getStringCellValue();
	       l.getpass().sendKeys(pass);
	       l.clicklogin().click();
	     System.out.println(driver.getTitle());*/
	     
	     //user is able to select lightlingapp
	     act.moveToElement(l.getlightlingapp()).build().perform();
	     Thread.sleep(3000);
	     
	    // l.getcelinglight().click();
	     l.getitem().click();
	     
	     //click large Chandeliers
	     l.getChandeliers().click();
	     
	     //Click chechbox
	    l.getcheckox().click();
	     Thread.sleep(3000);
	     //add to cart
	     l.getcart().click();
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1000)");
	     l.getnumber().clear();
	     l.getnumber().sendKeys("5");
	     act.moveToElement(l.getclickcart()).build().perform();
	     l.getclickcart().click();
	     driver.findElement(By.xpath("//*[@id='atcModal']/div/div/div/button")).click();
	     
	     
	     //view cart
         act.moveToElement(l.getviewcart()).build().perform();
	     l.getviewcart().click();
	     
	     //remove item from cart
	     l.getremoveitem().click();
	     
	     //apply coupon
	     l.getentercoupon().sendKeys("piyu");
	     l.getclickapply().click();
	     
	     //add item 
	     Thread.sleep(30000);
	     l.getadditem().click();
	     
	     //zipcode
	     l.getzip().sendKeys("425405");
	     l.getzipclick().click();
	     
	   
	  
	     //Logout
	     l.getl().click();
	     l.sign_in().click();
	     Thread.sleep(3000);
	     l.entername().sendKeys("sonawanepriyanka256@gmail.com");
	     l.getpass().sendKeys("Priyanka@22");
	     l.clicklogin().click();
	     
	     act.moveToElement(l.getl()).build().perform();
	     l.sign_in().click();
	     
	     //Search
	     l.getsearch().sendKeys("wall lights" +Keys.ENTER);
	     
	     //navigate back to home page
	     driver.navigate().back();
	     driver.navigate().back();
	     
/*	     //Live chat
	     Thread.sleep(10000);
	     l.getlivechat().click();
*/	     
	     //invalide credentials
	     l.getl().click();
	     l.sign_in().click();
	     Thread.sleep(3000);
	     l.entername().sendKeys("sonawanepriyanka56@gmail.com");
	     l.getpass().sendKeys("Priyanka@22");
	     l.clicklogin().click();
	     
	    
	     
	     }

	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	      // driver.get(strArg1);
	    	File src=new File("C:\\Users\\vighnharta\\Documents\\cucumber.xlsx");
			FileInputStream input=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(input);
			XSSFSheet sheet=wb.getSheet("Sheet1");
			String url=	sheet.getRow(1).getCell(2).getStringCellValue();
	       driver.get(url);
	    }

}