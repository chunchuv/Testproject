import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGbasics {
	
	/* RESULT
	setup system property for chrome
    launch browser
    Login into app
    Enter URL
    Google Title Test
    Logout
    Close the browser
    delete all cookies
    PASSED: googletitletest
*/
	
	// pre-condition Annotations -- starting with @ Before
	
@BeforeSuite  //1
public void setup() {
	System.out.println("setup system property for chrome");
}
	
@BeforeTest //2
public void launchBrowser() {
	System.out.println("launch browser");
	
}
@BeforeClass // 3
public void loginL() {
	System.out.println("Login into app");
	
}

@BeforeMethod //4
public void URL(){
	System.out.println("Enter URL");
}
	// test cases starting with @Test
	@Test   //5
	public void googletitletest() {
		System.out.println("Google Title Test");
		
}
	
	@Test 
	public void searchpage() {
		System.out.println("search the page");
	}
	
	@Test 
	public void Googlelogotest() {
		System.out.println("verify google logo");
	}
	
    // post conditions starting with @After 
    @AfterMethod //6
    public void logout() {
    	System.out.println("Logout");
    	
    	
 }
    
    @AfterClass //7
    public void closebrowser() {
    	System.out.println("Close the browser");  
    }
    	
    	
    @AfterTest//8
    public void deleteAllcookies() {
    	System.out.println("delete all cookies");
    	
    }
       
}
