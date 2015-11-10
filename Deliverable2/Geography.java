import java.util.*;
import java.lang.*;

public class Geography{
	private static HashMap<String, String[][]> map = new HashMap<String, String[][]>();
	private static String[] locs = {"Mall", "Bookstore", "Coffee Shop", "University", "Outside City"};
	private static Random rand;

	public Geography(int n){
		rand = new Random(n);
		String[][] temp = {{"Bookstore", "Fourth Ave."}, {"Coffee Shop", "Meow St."}};
		map.put("Mall", temp);
		String[][] temp2 = {{"Outside City", "Fourth Ave."}, {"University", "Chirp St."}};
		map.put("Bookstore", temp2);
		String[][] temp3 = {{"Mall", "Meow St."}, {"Outside City", "Fifth Ave."}};
		map.put("Coffee Shop", temp3);
		String[][] temp4 = {{"Coffee Shop", "Fifth Ave."}, {"Bookstore", "Chirp St."}};
		map.put("University", temp4);
		String[][] temp5 = {{"Mall", "Fourth Ave."}, {"University", "Fifth Ave."}};
		map.put("Outside City", temp5);
	}

	public static String getStart(){
		String start = locs[rand.nextInt(5)];
		return start;
	}

	public static String[][] getNext(String loc){
		String[][] next = map.get(loc);
		return next;
	}

	public static String[] choose(String[][] next){
		String[] choice = next[rand.nextInt(2)];
		return choice;
	}
}
