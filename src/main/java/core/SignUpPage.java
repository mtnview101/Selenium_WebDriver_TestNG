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

public class SignUpPage {
	
// String content = quote, temperature, current_city, copyright, todays_day, os_browser	
public static String verify_content (String content) throws IOException{
	Browser.setWebDriver(BasePage.in_browser);
	Browser.driver.get(BasePage.url);	
	
	String content_test = Browser.driver.findElement(By.id(content)).getText();
	if (Browser.driver != null) {Browser.driver.quit();}
	return content_test;} // verify_content END
}
