package core;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpPageTest {
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  Browser.setWebDriver(BasePage.in_browser);
	  Browser.driver.get(BasePage.url);}
	
  @Test
  public void test_01_verify_content_quotes() throws IOException {
	  boolean status=false;
	  String quote = SignUpPage.verify_content("id_quotes");
	  if (quote != null && quote.length() < 112 && quote.length() > 36) status=true; else status=false;
	  Assert.assertEquals(status, true);}
  
  @Test
  public void test_02_verify_content_current_city() throws IOException {
	  String current_city = SignUpPage.verify_content("id_current_location");
	  Assert.assertEquals(current_city, "San Francisco, CA");}
  
  @Test
  public void test_03_verify_content_current_weather() throws IOException {
	  String temperature = SignUpPage.verify_content("id_temperature");
	  Assert.assertEquals(temperature, "64 ℉");} 
  
  @Test
  public void test_04_verify_content_date() throws IOException {
	  String todays_day = SignUpPage.verify_content("timestamp");
	  Assert.assertEquals(todays_day, "February 10, 2017 ");} 

  @Test
  public void test_05_verify_content_os() throws IOException {
	  String os_browser = SignUpPage.verify_content("os_browser");
	  Assert.assertEquals(os_browser, "Windows 10 & Chrome");}  

  @Test
  public void test_07_verify_link_facebook() throws IOException, InterruptedException {
	  String id_img_facebook = SignUpPage.verify_link("id_img_facebook");
	  Assert.assertEquals(id_img_facebook, "Facebook - Log In or Sign Up");}
  
  @Test
  public void test_08_verify_link_twitter() throws IOException, InterruptedException {
	  String id_img_twitter = SignUpPage.verify_link("id_img_twitter");
	  Assert.assertEquals(id_img_twitter, "Twitter. It's what's happening.");} 
  
  @Test
  public void test_09_verify_link_flick() throws IOException, InterruptedException {
	  String id_img_flickr = SignUpPage.verify_link("id_img_flickr");
	  Assert.assertEquals(id_img_flickr, "Find your inspiration. | Flickr");} 

  @Test
  public void test_10_verify_link_youtube() throws IOException, InterruptedException {
	  String id_img_youtube = SignUpPage.verify_link("id_img_youtube");
	  Assert.assertEquals(id_img_youtube, "YouTube");}  

  @Test
  public void test_12_verify_error_handling_face_first_name() throws IOException, InterruptedException {
	  String id_fname = SignUpPage.verify_error_handling("id_fname");
	  Assert.assertEquals(id_fname, "Please enter First Name");}
	
  @Test
  public void test_13_verify_error_handling_face_last_name() throws IOException, InterruptedException {
	  Browser.driver.findElement(By.id("id_fname")).sendKeys(BasePage.fname);
	  String id_lname = SignUpPage.verify_error_handling("id_lname");
	  Assert.assertEquals(id_lname, "Please enter Last Name");} 
	
  @Test
  public void test_14_verify_error_handling_email() throws IOException, InterruptedException {
	  Browser.driver.findElement(By.id("id_fname")).sendKeys(BasePage.fname);
	  Browser.driver.findElement(By.id("id_lname")).sendKeys(BasePage.lname);
	  String id_email = SignUpPage.verify_error_handling("id_email");
	  Assert.assertEquals(id_email, "Please enter Email Address");} 
	
  @Test
  public void test_15_verify_error_handling_phone_number() throws IOException, InterruptedException {
	  Browser.driver.findElement(By.id("id_fname")).sendKeys(BasePage.fname);
	  Browser.driver.findElement(By.id("id_lname")).sendKeys(BasePage.lname);
	  Browser.driver.findElement(By.id("id_email")).sendKeys(BasePage.email);
	  String id_phone = SignUpPage.verify_error_handling("id_phone");
	  Assert.assertEquals(id_phone, "Please enter Phone Number");} 

  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
