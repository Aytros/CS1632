import static org.junit.Assert.*;
import org.juniit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

/*
As a User
I would like to have a navigation bar
So that I may go to different areas of the website
*/
public class navTester{
	static WebDriver driver = new HtmlUnitDriver();

	//Start at Myth Weavers home
	@Before
	public void setUp() throws Exception{
		driver.get("http://www.myth-weavers.com/");
	}

	/*
	Given: Logged into a valid account
	When: I look at the navigation bar
	Then: I will see a link for my user profile
	*/
	@Test
	public void testProfile(){
		driver.findElement(By.id("navbar_username")).clear();
		driver.findElement(By.id("navbar_username")).sendKeys("Aytros");
		driver.findElement(By.id("navbar_password")).clear();
		driver.findElement(By.id("navbar_password")).sendKeys("Mystra@428");
		driver.findElement(By.value("Log in")).click();
		String test = driver.findElement(By.linkText("Aytros")).getAttribute("title");
		assertTrue(test.contains("Profile"));
	}

	/*
	Given: a loaded site
	When: I view the navigation bar
	Then: I will see a link to a wiki page
	*/
	@Test
	public void testWiki(){
		try{
			driver.findElement(By.linkText("Wiki"))
		} catch (NoSuchElementException excp){
			fail();
		}
	}

	/*
	Given: a loaded site
	When: I view the navigation bar
	Then: I will see a link to view my character sheets
	*/
	@Test
	public void testSheets(){
		try{
			driver.findElement(By.linkText("Sheets"));
		} catch (NoSuchElementException excp){
			fail();
		}
	}

	/*
	Given: a loaded site
	When: I view the navigation bar
	Then: I will see a link to currently running games
	*/
	@Test
	public void testGames(){
		try{
			driver.findElement(By.linkText("Games"));
		} catch (NoSuchElementException excp){
			fail();
		}
	}

	/*
	Given: a loaded site
	When: I view the navigation bar
	Then: I will see a link for the maps that I have created
	*/
	@Test
	public void testMaps(){
		try{
			driver.findElement(By.linkText("Maps"));
		} catch (NoSuchElementException excp){
			fail();
		}
	}

	/*
	Given: a loaded site
	When: The navigation bar is viewed
	Then: I will see a link to an online store
	*/
	@Test
	public void testShop(){
		try{
			driver.findElement(By.linkText("Shop"));
		} catch (NoSuchElementException excp){
			fail();
		}
	}

	//clean up 
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
}