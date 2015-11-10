import static org.junit.Assert.*;
import org.juniit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

/*
As a User,
I would like to login to Myth Weavers
So that I can access my account
*/
public class LogInTester{
	static WebDriver driver = new HtmlUnitDriver();

	//Start at Myth Weavers home
	@Before
	public void setUp() throws Exception{
		driver.get("http://www.myth-weavers.com/");
	}

	/*
	Given: Correct Username and Password
	When: I log in
	Then: My credentials should be accepted
	*/
	@Test
	public void testCorrectLogin(){
		driver.findElement(By.id("navbar_username")).clear();
		driver.findElement(By.id("navbar_username")).sendKeys("Aytros");
		driver.findElement(By.id("navbar_password")).clear();
		driver.findElement(By.id("navbar_password")).sendKeys("Mystra@428");
		driver.findElement(By.value("Log in")).click();
		String test = driver.findElement(By.linkText("Aytros")).getText();
		assertEquals(test, "Aytros");
	}

	/*
	Given: Incorrect username and correct password
	When: I login
	Then: my credentials shold be rejected
	*/
	@Test
	public void testIncorrectNameCorrectPass(){
		driver.findElement(By.id("navbar_username")).clear();
		driver.findElement(By.id("navbar_username")).sendKeys("wrong");
		driver.findElement(By.id("navbar_password")).clear();
		driver.findElement(By.id("navbar_password")).sendKeys("Mystra@428");
		driver.findElement(By.value("Log in")).click();
		String test = driver.findElement(By.name("securitytoken")).getAttribute("value");
		assertEquals(test, "guest");
	}

	/*
	Given: Correct username and incorrect password
	When: I login
	Then: my credentials shold be rejected
	*/
	@Test
	public void testCorrectNameIncorrectPass(){
		driver.findElement(By.id("navbar_username")).clear();
		driver.findElement(By.id("navbar_username")).sendKeys("Aytros");
		driver.findElement(By.id("navbar_password")).clear();
		driver.findElement(By.id("navbar_password")).sendKeys("wrong");
		driver.findElement(By.value("Log in")).click();
		String test = driver.findElement(By.name("securitytoken")).getAttribute("value");
		assertEquals(test, "guest");
	}

	/*
	Given: Incorrect username and Incorrect password
	When: I login
	Then: my credentials shold be rejected
	*/
	@Test
	public void testIncorrectNameIncorrectPass(){
		driver.findElement(By.id("navbar_username")).clear();
		driver.findElement(By.id("navbar_username")).sendKeys("wrong");
		driver.findElement(By.id("navbar_password")).clear();
		driver.findElement(By.id("navbar_password")).sendKeys("wrong");
		driver.findElement(By.value("Log in")).click();
		String test = driver.findElement(By.name("securitytoken")).getAttribute("value");
		assertEquals(test, "guest");
	}

	//clean up 
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}