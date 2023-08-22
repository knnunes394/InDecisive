import java.util.ArrayList;

public class Chinese implements Dish {

	
	public void make(){
		System.out.println("Made a Chinese dish");
	}

	public ArrayList<String> getIngredients(){
		return null;
	}

	public boolean haveIngredients(String[] lists){
		return true;		
	}
}
