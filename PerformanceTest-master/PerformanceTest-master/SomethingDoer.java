import java.util.*;
import java.io.*;

public class SomethingDoer {

    FileName _fileName;

    public SomethingDoer(FileName f) {
	_fileName = f;
    }
    
    private ArrayList<String> getNewArrayList() {
	ArrayList<String> toReturn = new ArrayList<String>();
	for (int j = 0; j < 400; j++) {
	    toReturn.add("" + j);
	}
	return toReturn;
    }

    private ArrayList<String> clearOutArrayList(ArrayList<String> arr) {
	ArrayList<String> toReturn = new ArrayList<String>();
	for (String a : arr) {
	    toReturn.add(a);
	}
	int count = arr.size();
	for (int j = 0; j < count; j++) {
	    toReturn.remove(0);
	}
	return toReturn;
	
    }

    public String[] convertToStringArray(Object[] objs) {
	ArrayList<String> strings = getNewArrayList();
	strings = clearOutArrayList(strings);
	for (Object obj : objs) {
	    String x = (String) obj;
	    strings.add(x);
	}
	String[] toReturn = new String[strings.size()];

	int count = 0;
	for (String s : strings) {
	    toReturn[count++] = s;
	}
	
	return toReturn;
    }
    
    public void doIt(FileName f) {
	_fileName = f;
	
	ArrayList<String> strings = getNewArrayList();

	strings = clearOutArrayList(strings);

	FileAccess fa = new FileAccess();
	strings = fa.readFile(f.name);

	DataCalculator dc = new DataCalculator();

	Object[] strings2 = strings.toArray();

	String[] strings3 = convertToStringArray(strings2);
	
	int[] calculated = dc.calculate((new StrategyOne()), strings3);

	int total = 0;
	for (int line : calculated) {
	    total += line;
	}

	OutputControl oc = new OutputControl(System.out);
	oc.print("" + (total % 100));

    }
    
}
