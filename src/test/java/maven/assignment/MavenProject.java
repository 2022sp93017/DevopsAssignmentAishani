
package maven.assignment;
import org.openqa.selenium.chrome.ChromeDriver;


public class MavenProject {
	
		public static void main(String[] args) throws InterruptedException
		  {
//		Mention here location of downloaded chrome driver path
		System.setProperty("webdriver.chrome.driver","D:/NGA/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.close();
		  
		}
	

}
