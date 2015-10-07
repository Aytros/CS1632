import java.util.*;

public class Node{
	private static String name;
	private static String[][] next;

	public Node(String id, String[][] dest){
		name = id;
		next = dest;
	}

	public static String getLoc(){
		return name;
	}

	public static String[][] getDest(){
		return next;
	}
}