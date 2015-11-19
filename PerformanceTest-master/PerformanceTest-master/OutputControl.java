import java.util.*;
import java.io.*;

public class OutputControl {

    private PrintStream _printStream;
    
    public OutputControl(PrintStream ps) {
	_printStream = ps;
    }

    public void print(String toPrint) {
	PrinterThing pt = new PrinterThing(_printStream);
	pt.printSomething(toPrint);
    }
    
}

interface PrInterFace {
    public void printSomething(String something);
}
    

class PrinterThing implements PrInterFace{

    protected PrintStream _printStream = null;
    
    public PrinterThing(PrintStream ps) {
	_printStream = ps;
    }

    public void printSomething(String something) {
	_printStream.println(something);
    }
	
    
}
