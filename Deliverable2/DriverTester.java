import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class DriverTester{
	//create a new Driver object with an id value.
	//Get and store the id into a variable
	//Variable should be equal to the int value used to construct the Driver
	@Test
	public void testId(){
		Driver driver = new Driver(5);
		int id = driver.getId();
		Assert.assertEquals(5, id);
	}

	//Set the current location of a Driver object
	//Get that location and store in a variable
	//variable should be equal to the location given  to Driver
	@Test
	public void testLoc(){
		Driver driver = new Driver(5);
		driver.setLoc("Here");
		String loc = driver.getLoc();
		Assert.assertEquals("Here", loc);
	}

	//Testing the isOut() function of Driver using various
	//combinations of the flag and currloc attributes

	//Set current location to "Outside City" and flag to true
	//boolean of isOut() should be true
 	@Test
	public void testIsOut(){
		Driver driver = new Driver(5);
		driver.setLoc("Outside City");
		driver.setFlag();
		//boolean out = driver.isOut();
		Assert.assertTrue(driver.isOut());
	}

	//create a new Driver
	//isOut() should return false
	@Test
	public void testIsOutFalse(){
		Driver driver = new Driver(5);
		Assert.assertFalse(driver.isOut());
	}

	//set flag to true and Location to other than "Outside City"
	//value of isOut() should be false
	@Test
	public void testIsOutFalseTwo(){
		Driver driver = new Driver(5);
		driver.setFlag();
		driver.setLoc("Mall");
		Assert.assertFalse(driver.isOut());
	}

	//set location to "Outside City" and keep flag to false
	//avlue of isOut() should be false
	@Test
	public void testIsOutFalseThree(){
		Driver driver = new Driver(5);
		driver.setLoc("Outside City");
		Assert.assertFalse(driver.isOut());
	}
}