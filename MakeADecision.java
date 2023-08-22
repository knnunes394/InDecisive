import java.util.ArrayList;
//import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MakeADecision {

	String decided;
	


	public String makeADecision(){
		MakeADecision decision = new MakeADecision();
		ArrayList<String> foods = new ArrayList<String>();
		foods = decision.readIn("TypesOfFood.txt");
		decision.printList(foods);
		System.out.println("What type of Cuisine are we feeling today bois");
		Scanner sc = new Scanner(System.in);
		decided = sc.nextLine();
		decided.toUpperCase();
		sc.close();
		System.out.println("You decided on " + decided);	
		//return decided;
		decision.createDish(decided);
		return decided;
		
	}

	private void createDish(String dishName){
		if(dishName == "italian"){
			Italian dish = new Italian();
			dish.make();
			dish.getIngredients();
		}
	}
	
	private ArrayList<String> readIn(String filename){
		File text = new File(filename);
	    ArrayList<String> food = new ArrayList<String>();   
		try {
	    	Scanner scan = new Scanner(text);
	    	while(scan.hasNextLine()){
	    		String line = scan.nextLine();
				//System.out.println("line " + lineNumber + " :" + line);
				food.add(line);
				
	    	}
		scan.close();
	    }
	    catch (FileNotFoundException e){
	    	e.printStackTrace();
	    }
		return food;	
	}

	public void printList(ArrayList<String> cuisines){
		for (int i = 0; i < cuisines.size(); i++){
			System.out.println(cuisines.get(i));
		}
	}
}
