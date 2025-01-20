package Openbrowser;


import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;


public class Baise {
public	WebDriver driver = null;
	
// public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//	OpenBrowser();
//}


 
public void OpenBrowser() throws EncryptedDocumentException, IOException, InterruptedException
{
		  System.setProperty(
		            "webdriver.chrome.driver",
		          
				  "D:\\chrome\\131-version\\chromedriver-win64\\chromedriver.exe");
		  
		  
		  // Instantiate a ChromeDriver class.
	        driver = new ChromeDriver();
	        Thread.sleep(5000);
 
        // Maximize the browser
	        driver.manage().window().maximize();
	        
	        ReadPropertiesFile();
	        // Launch Website
	        driver.get(url);

	}

//public String emailpath = null;
//public String passwordpath = null;
public String email = null;
public String password  = null;
//public String  submitbuttonpath = null;
public String  url = null;
public String  devurl = null;

public void ReadPropertiesFile() {

        Properties properties = new Properties();
        
        try (FileInputStream fis = new FileInputStream("C:\\Users\\sandeep.malviya\\eclipse-workspace\\Testing\\src\\test\\resources\\LoginFields\\Login.properties")) 
        {
            // Load properties file
            properties.load(fis);
           
             email =properties.getProperty("Email");     
             password =properties.getProperty("Password");
             url =properties.getProperty("URL");
             //devurl = properties.getProperty("DevUrl");
             
             //emailpath =properties.getProperty("Emailpath");
             // passwordpath =properties.getProperty("Passwordpath");
             //submitbuttonpath = properties.getProperty("Submitbuttonpath");

        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


//public String getEmail() {
//	return emailpath;
//}

}

//public ReadFile {
//    
//        try {
//            Path filePath = Paths.get("path/to/your/file.txt");
//            List<String> fileContent = Files.readAllLines(filePath);
//
//            for (String line : fileContent) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


