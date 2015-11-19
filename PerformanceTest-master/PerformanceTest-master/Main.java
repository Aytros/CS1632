// import java.util.*;

public class Main {

    public static void main(String[] args) {

	int bird = 0;
	for (int j = 0; j < 100000; j++) {
	    for (int k = 0; k <10000; k++) {
		for (int l=0; l <100000; l++) {
		    bird += j + k + l;
		}
	    }
	}
	System.out.println(bird);
	
	// if (args.length < 1) {
	//     System.out.println("Pass in filename as argument");
	//     System.exit(1);
	// }
	
	// FileName fn = new FileName(args[0]);

	// SomethingDoer sd = new SomethingDoer(fn);

	// sd.doIt(fn);
	
    }
    
}
