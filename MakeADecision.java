import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MakeADecision {
    public static void main(String args[]){	
	    File text = new File("TypesOfFood.txt");
	    try {
	    	Scanner scan = new Scanner(text);
	    	int lineNumber = 1;
	    	while(scan.hasNextLine()){
	    		String line = scan.nextLine();
			System.out.println("line " + lineNumber + " :" + line);
			lineNumber++;
	    	}
		scan.close();
	    }
	    catch (FileNotFoundException e){
	    	e.printStackTrace();
	    }

	    ArrayList<String> possible = new ArrayList<String>();
	    possible.add("switch");
	    possible.add("pc");
	    possible.add("ps4");
	    possible.add("tv");

	    Random rand = new Random();
	    int up = 5;
	    int int_random = rand.nextInt(up);

	    System.out.println(possible.get(int_random));
    }





}
