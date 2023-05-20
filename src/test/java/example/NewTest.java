package example;		

//import org.testng.annotations.Test;
import org.testng.AssertJUnit;
//import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;		
import org.openqa.selenium.chrome.*;				
//import org.testng.annotations.BeforeTest;	
//import org.testng.annotations.AfterTest;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class NewTest {

	    private WebDriver driver;		
		@Test				
		public void testRegistration() {	
		
	        driver.get("https://www.amazon.in");
	        driver.findElement(By.id("nav-link-accountList")).click();
	        driver.findElement(By.id("createAccountSubmit")).click();
	        String title = driver.getTitle();				 
			AssertJUnit.assertTrue(title.contains("Amazon Registration")); 
			driver.findElement(By.id("ap_customer_name")).sendKeys("ABC");
			driver.findElement(By.id("ap_phone_number")).sendKeys("8798789889");
			driver.findElement(By.id("ap_email")).sendKeys("abcrt78@gmail.com");
			driver.findElement(By.id("ap_password")).sendKeys("1234");
			driver.findElement(By.id("continue")).click();
			
	
		}
		@Test
		public void testProductSearch() {	
			
	        driver.get("https://www.amazon.in");
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Teddy Bear");
			driver.findElement(By.id("nav-search-submit-button")).click();
	
		   
		}

		@Before
		public void beforeTest() {	
		    driver = new ChromeDriver();  
		}		
		@After
		public void afterTest() {
			driver.quit();			
		}		
}	

