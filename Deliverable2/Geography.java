import java.util.*;
import java.lang.*;

public class Geography{
	private static Node[] locations = {
		new Node("Mall", new String[][]{{"Bookstore", "Fourth Ave."}, {"Coffee Shop", "Meow St."}}),
		new Node("Bookstore", new String[][]{{"Outside City", "Fourth Ave."}, {"University", "Chirp St."}}),
		new Node("Coffee Shop", new String[][]{{"Mall", "Meow St."}, {"Outside City", "Fifth Ave."}}),
		new Node("University", new String[][]{{"Coffee Shop", "Fifth Ave."}, {"Bookstore", "Chirp St."}}),
		new Node("Outside City", new String[][]{{"Mall", "Fourth Ave."}, {"University", "Fifth Ave."}}),
	}
	private static Random rand;

	public Geography(int n){
		rand = new Random(n);
	}

	public static String getStart(){
		Node start = locations[rand.nextInt(5)];
		return start.getLoc();
	}

	public static String[][] getNext(String loc){
		String[][] next = new String[][];
		for (int i = 0; i < locations.length; ++i){
			Node temp = locations[i];
			if (temp.getLoc() == loc){
				next = temp.getDest();
			}
		}
		return next;
	}

	public static String[] choose(String[][] next){
		String[] choice = next[rand.nextInt(2)];
		return choice;
	}
}