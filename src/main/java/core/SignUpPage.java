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
public static void main(String[] args) throws IOException, InterruptedException {
		
String in_browser = "Edge"; // "HtmlUnit" "Firefox" "Chrome"  "Safari"  "IE"  "Edge"
Browser.setWebDriver(in_browser);

final long start = System.currentTimeMillis(); // start time for test

final long finish = System.currentTimeMillis();  // final time for test



String url = "http://alex.academy/ua"; // environment verification by user agent
Browser.driver.get(url);
String ua = Browser.driver.findElement(By.id("id_ua")).getText();
System.out.println("User Agent: \t " + ua);
System.out.println("Response time: \t " + (finish - start) + " milliseconds:");
if (Browser.driver != null)
{Browser.driver.quit();}
        
	}
}
