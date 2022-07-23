package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
	public WebDriver driver;

  @Test
  public void firefoxWebDriver() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\lo0ol\\Downloads\\"
	  		+ "Compressed\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.navigate().to("https://sda.edu.sa/");
		 // driver.close();
  }
}
