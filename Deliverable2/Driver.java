import java.util.*;
import java.lang.*;

public class Driver{
	private static int id;
	private static String currloc;
	private static boolean flag;

	public Driver(int n){
		id = n;
		flag = false;
	}

	public static void setLoc(String loc){
		currloc = loc;
	}

	public static void setFlag(){
		flag = true;
	}

	public static int getId(){
		return id;
	}

	public static String getLoc(){
		return currloc;
	}

	public static boolean isOut(){
		if (flag == false){
			flag = true;
			return false;
		} else {
			if (currloc.equals("Outside City")){
				return true;
			} else {
				return false;
			}
		}
	}
}