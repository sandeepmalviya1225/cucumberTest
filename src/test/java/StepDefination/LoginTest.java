package StepDefination;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.annotation.Annotation;

import Openbrowser.Baise;
import Openbrowser.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends Baise {
	

	
	Login_Page loginpage = new Login_Page();
	//Baise baise = new Baise();
	
	 @Given("user is on the login page")
	    public void user_is_on_the_login_page() {
		
		 try {
			OpenBrowser();
		} catch (EncryptedDocumentException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			 System.setProperty(
//			            "webdriver.chrome.driver",
//			          
//					  "D:\\chrome\\131-version\\chromedriver-win64\\chromedriver.exe");
//			  
//			  // Instantiate a ChromeDriver class.
//		        driver = new ChromeDriver();
//		      //  Thread.sleep(5000);
//	 
//	        // Maximize the browser
//		        driver.manage().window().maximize();
//		        
//		       // ReadPropertiesFile();
//		        
//		        String url = "https://www.google.com/";
//		        driver.get(url);
//		        throw new io.cucumber.java.PendingException();
//		
	 }
		        // Launch Website
		       // driver.get(https://alphaags.iplatformsolutions.com);

//OpenBrowser();
//		} catch (EncryptedDocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	 
	 
	 
//	ReadPropertiesFile();
//		

		
	

	  @When("user enters valid username and password")
	    public void user_enters_valid_username_and_password() {
		  
	        // Locate the username, password fields, and login button

			driver.findElement(By.xpath(loginpage.loginemailpath)).sendKeys(email);
		driver.findElement(By.xpath(loginpage.loginpasswordpath)).sendKeys(password);
			driver.findElement(By.xpath(loginpage.loginsubmitbuttonpath)).click();
		  throw new io.cucumber.java.PendingException();
	    }
	  @Then("user is redirected to the homepage")
	    public void user_is_redirected_to_the_homepage() {
	        String title = driver.getTitle();
	        
	        driver.quit();
	        throw new io.cucumber.java.PendingException();
	    }
}
