package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void openBrowser() {
	  
	  WebDriver driver = ChromeDriver();
	  driver.get("http://www.google.com");
	
  }
  

}
