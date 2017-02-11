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

public class SignUpPage extends BasePage {
	
// String content = quote, temperature, current_city, copyright, todays_day, os_browser	
public static String verify_content (String content) throws IOException{
	String content_test = Browsers.driver.findElement(By.id(content)).getText();
	if (Browsers.driver != null) {Browsers.driver.quit();}
	return content_test;} // verify_content END

//String link = id_img_facebook, id_img_twitter, id_img_flickr, id_img_youtube
public static String verify_link (String content) throws IOException, InterruptedException{
	Thread.sleep(1000);	
	Browsers.driver.findElement(By.id(content)).click();
	Browsers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(1500);
	
	ArrayList<String> allTabs = new ArrayList<String>(Browsers.driver.getWindowHandles());
	Browsers.driver.switchTo().window(allTabs.get(1));
	Thread.sleep(1000);
	String content_test = Browsers.driver.getTitle();
	Browsers.driver.close();
	Browsers.driver.switchTo().window(allTabs.get(0));
	if (Browsers.driver != null) {Browsers.driver.quit();}
	return content_test;} // verify_link END


public static String verify_error_handling (String content) throws IOException{
	Browsers.driver.findElement(By.id("id_submit_button")).click();
	String err_xpath=".//*[@id='ErrorLine']";
	String content_test = Browsers.driver.findElement(By.xpath(err_xpath)).getText();
	//String title = verify_page_application_title("id_f_title");
	if (Browsers.driver != null) {Browsers.driver.quit();}
	return content_test;} // verify_content END




}
