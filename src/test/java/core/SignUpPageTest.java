package core;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest {
	
/* 
	String quote = "id_quotes";
	String temperature = "id_temperature"; 64 ℉
	String current_city = "id_current_location"; San Francisco, CA
	String copyright = "copyright"; 
	String todays_day = "timestamp"; 
	String os_browser = "os_browser";
	*/
/*  @Test
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
	  System.out.println(todays_day);
	  Assert.assertEquals(todays_day, "February 9, 2017 ");} */

  @Test
  public void test_05_verify_content_os() throws IOException {
	  String os_browser = SignUpPage.verify_content("os_browser");
	  System.out.println(os_browser);
	  Assert.assertEquals(os_browser, "Windows 10 & Chrome");}  
  
}
