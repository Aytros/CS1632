import java.util.*;
import java.io.*;

public class FileAccess {

    public ArrayList<String> readFile(String fileLocation) {
	
	String line = "";
	ArrayList<String> fileData = new ArrayList<String>();
	
	try {
	    FileReader fileReader = new FileReader(fileLocation);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
		fileData.add(line);
            }   

            // Always close files.
            fileReader.close();         
        }
        catch(Exception ex) {
            System.out.println("Problem reading file: " + fileLocation);
	}
	return fileData;
    }
    
}
