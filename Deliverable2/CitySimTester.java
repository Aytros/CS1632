import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
import java.io.*;
import java.lang.*;

public class CitySimTester{
	@Test
	public void driveTest(){
		Geography geo = new Geography(9);
		BufferedReader buff = new BufferedReader(new FileReader("output.txt"));
		String outStr = null;

		while (buff.ready()){
			outStr += buff.readLine();
		}

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(ps);
		PrintStream old = System.out;
		System.setOut(ps);
		System.out.println(CitySim9000.drive(geo));
		System.out.flush();
		System.setOut(old);

		assertEquals(outStr, ps);
	}
}