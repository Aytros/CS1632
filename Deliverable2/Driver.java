import java.util.*;
import java.lang.*;

public class Driver{
	private static int id;
	private static String currloc;

	public Driver(int n){
		id = n;
	}

	public static void setLoc(String loc){
		currloc = loc;
	}

	public static String getLoc(){
		return currloc;
	}

	public static boolean isOut(){
		if (currloc == "Outside City"){
			return true;
		} else {
			return false;
		}
	}
}