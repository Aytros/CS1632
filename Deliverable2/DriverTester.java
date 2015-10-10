import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class DriverTester{
	@Test
	public void testId(){
		Driver driver = new Driver(5);
		int id = driver.getId();
		assertEquals(5, id);
	}

	@Test
	public void testLoc(){
		Driver driver = new Driver(5);
		driver.setLoc("Here");
		String loc = driver.getLoc();
		assertEquals("Here", loc);
	}

	@Test
	public void testIsOut(){
		Driver driver = new Driver(5);
		driver.setLoc("Outside City");
		driver.setFlag();
		boolean out = driver.isOut();
		assertEquals(true, out);
	}
}