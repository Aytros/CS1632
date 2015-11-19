import java.util.*;

public class DataCalculator {

    
    public DataCalculator() {
    }
    
    private int getSize(String[] arr) {
	int toReturn = 0;
	for (int j = 0; j < arr.length; j++) {
	    toReturn++;
	}
	return toReturn;
    }
    
    public int[] calculate(StrategyInterface strategy, String[] strings) {
	int size = getSize(strings);
	int[] toReturn = new int[size];
	for (int j = 0; j < strings.length; j++) {
	    int calced = strategy.calculate(strings[j]);
	    toReturn[j] = calced;
	}

	return toReturn;
    }
    
}
