import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void gooleTest() {
	  
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");
  }
}
