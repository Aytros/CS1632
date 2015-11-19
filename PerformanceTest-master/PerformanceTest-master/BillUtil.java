public class BillUtil {

    private static int offset = 0;

    public static int value() {
	int toReturn = 0;
	for (int j = 0; j < (++offset * 111); j++) {
	    toReturn++;
	}
	return toReturn % 100;
    }

    public static int superValue() {
	boolean done = false;
	int toReturn = 0;
	while (!done) {
	    toReturn++;
	    if (toReturn > 7000) {
		for (int j = 0; j < toReturn; j++) {
		    for (int k =0; k < 20; k++) {
			toReturn += k;
		    }
		    toReturn = toReturn - (toReturn - 1);
		}
	    } else {
		toReturn++;
	    }
	}
	return toReturn;
    }
    
}
