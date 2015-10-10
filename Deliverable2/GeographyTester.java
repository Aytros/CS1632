import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class GeographyTester{
	@Test
	public void testNext(){
		Geography geo = new Geography(9);
		String[][] next = geo.getNext("Mall");
		String[][] control = new String[][]{{"Bookstore", "Fourth Ave."}, {"Coffee Shop", "Meow St."}};
		assertEquals(control, next);
	}

	@Test
	public void testStart(){
		Geography geo = new Geography(9);
		String start = geo.getStart();
		assertEquals(start, "Outside City");
	}

	@Test
	public void testChoose(){
		Geography geo = new Geography(9);
		String[][] test = new String[][]{{"Mall", "Fourth Ave."}, {"University", "Fifth Ave."}};
		String[] test2 = new String[]{"University", "Fifth Ave."};
		String[] choice = geo.choose(test);
		assertEquals(choice, test2);
	}
}