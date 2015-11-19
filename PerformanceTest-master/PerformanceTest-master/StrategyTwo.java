public class StrategyTwo implements StrategyInterface {

    public int calculate(String s) {
	int toReturn = 0;
	for (int j = 0; j < s.length(); j++) {
	    toReturn += (byte) s.charAt(j);
	}
	return toReturn % s.length();
    }
    
}
