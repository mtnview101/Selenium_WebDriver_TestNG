package core;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class ConfirmationPage extends BasePage {
	
public static void verify_confirmation (String first_name, String last_name, String email, String phone) throws InterruptedException{
	  Browsers.driver.findElement(By.id("id_fname")).sendKeys(first_name);
	  Browsers.driver.findElement(By.id("id_lname")).sendKeys(last_name);
	  Browsers.driver.findElement(By.id("id_email")).sendKeys(email);
	  Browsers.driver.findElement(By.id("id_phone")).sendKeys(phone);
	  Browsers.driver.findElement(By.id("id_submit_button")).click();
	  Thread.sleep(2000);}

public static boolean verify_submit_form (String first_name, String last_name, String email, String phone) throws InterruptedException, IOException{
	  boolean status = false;  
	  verify_confirmation(first_name,last_name,email,phone);
	  if((first_name.equals(Browsers.driver.findElement(By.id("id_fname_conf")).getText())) && 
		 (last_name.equals(Browsers.driver.findElement(By.id("id_lname_conf")).getText())) && 
		 (email.equals(Browsers.driver.findElement(By.id("id_email_conf")).getText())) && 
		 (phone.equals(Browsers.driver.findElement(By.id("id_phone_conf")).getText()))) {status = true;}
	  if (Browsers.driver != null) {Browsers.driver.quit();}
	  return status;} // verify_submit_form END



} // ConfirmationPage END
