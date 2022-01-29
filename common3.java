package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class common3 {
	public WebDriver driver;
 
	
	  
	   public void shots() throws IOException {
		   
		   Date dt = new Date();
		   System.out.println(dt);
		   
		   String dt2 = dt.toString().replace(" ","_").replace(":","_");
		   
		   System.out.println(dt2);	   
		  		   
		   String local= System.getProperty("user.dir");
		   File stored = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(stored, new File(local+"\\Pictures\\"+dt2+"capture.jpg"));
		   
		   
 }
	
	
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  String local= System.getProperty("user.dir");
	    
		   System.setProperty("webdriver.chrome.driver", local + "\\src\\Drivers2\\chromedriver.exe");
		   driver = new ChromeDriver(); 
		   driver.navigate().to("https://www.expedia.com");
		   Thread.sleep(2000);
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.close();
  }
  
  
  
  

}
