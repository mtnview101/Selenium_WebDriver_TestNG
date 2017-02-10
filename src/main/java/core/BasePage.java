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

public class BasePage {
	static String in_browser = "Edge"; // "HtmlUnit" "Firefox" "Chrome"  "Safari"  "IE"  "Edge"

	static String url = "http://alex.academy/exercises/signup/v1/";
	static String title_sign_up_expected = "Welcome to Sign Up";
	static String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
	static String error_fname_empty_expected = "Please enter First Name";
	static String fname = "Dmitry";
	static String lname = "Nakhabtsev";
	static String email = "dima@gmail.com";
	static String phone = "315 212-8506";
	
public void verify_page_application_title (String SignUp_page, String Confirmation_page){
	
}

}
