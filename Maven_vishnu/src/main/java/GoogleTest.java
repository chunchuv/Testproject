import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Srilatha\\Desktop");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=2)
	public void googletitletest() {
		String title = driver.getTitle();
		System.out.println("google");
		
	}
	
	@Test(priority=1)
	public void Googlelogotest() {
		boolean B = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	@Test(priority=3)
	public void Maillinktest() {
		boolean C = driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]")).isDisplayed();
		
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}