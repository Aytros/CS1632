import java.lang.*;
import java.io.*;
import java.util.*;

public class CitySim9000{
	public static void main(String[] args){
		int seed = 0;

		if (args.length == 1){
			try{
				seed = Integer.parseInt(args[0]);
				Geography geo = new Geography(seed);
				for (int i = 0; i < 5; ++i){
					Driver driver = new Driver(i);
					driver.setLoc(geo.getStart());
					while (!driver.isOut()){
						String[][] destinations = geo.getNext(driver.getLoc());
						String[] choice = geo.choose(destinations);
						System.out.println("Driver " + i + " heading from " + driver.getLoc() + " to " + choice[0] + " via " + choice[1]);
						driver.setLoc(choice[0]);
					}
					System.out.println("Driver " + i + " has left the city!");
					System.out.println("------------");
				}
			} catch (NumberFormatException nFE){
				System.out.println("Correct usage: java CitySim9000 <integer>");
			}
		} else {
			System.out.println("Correct usage: java CitySim9000 <integer>");
		}
	}
}	