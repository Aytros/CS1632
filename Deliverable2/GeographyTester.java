import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class GeographyTester{
	//retrieve the possible destinations from a given location
	//compare the resulting matrix to a the expected outcome based on pseudo random seed
	//two matrices should be equal
	@Test
	public void testNext(){
		Geography geo = new Geography(9);
		String[][] next = geo.getNext("Mall");
		String[][] control = new String[][]{{"Bookstore", "Fourth Ave."}, {"Coffee Shop", "Meow St."}};
		Assert.assertArrayEquals(control, next);
	}

	//set the starting location for a map run through
	//compare to expected value
	//should be equal
	@Test
	public void testStart(){
		Geography geo = new Geography(9);
		String start = geo.getStart();
		Assert.assertEquals(start, "Outside City");
	}

	//get the a psuedo random next destination from a set of choices
	//compare to the expected value based on the psuedo random seed
	//two arrays should be equal
	@Test
	public void testChoose(){
		Geography geo = new Geography(9);
		String[][] test = new String[][]{{"Mall", "Fourth Ave."}, {"University", "Fifth Ave."}};
		String[] test2 = new String[]{"University", "Fifth Ave."};
		String[] choice = geo.choose(test);
		Assert.assertArrayEquals(choice, test2);
	}
}
