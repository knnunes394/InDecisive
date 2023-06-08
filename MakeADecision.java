import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MakeADecision {
    
	private ArrayList<String> food = new ArrayList<>();
	
	
	private void readIn(String filename){
		File text = new File(filename);
	    ArrayList<String> food = new ArrayList<String>();   
		try {
	    	Scanner scan = new Scanner(text);
	    	int lineNumber = 1;
	    	while(scan.hasNextLine()){
	    		String line = scan.nextLine();
				System.out.println("line " + lineNumber + " :" + line);
				food.add(line);
				lineNumber++;
	    	}
		scan.close();
	    }
	    catch (FileNotFoundException e){
	    	e.printStackTrace();
	    }	
	}
	
	public static void main(String args[]){	
		MakeADecision decision = new MakeADecision();
		decision.readIn("TypesOfFood.txt");


		
    }

}
