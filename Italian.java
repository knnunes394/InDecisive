import java.util.ArrayList;

public class Italian implements Dish {
	
	public void make(){
		System.out.println("Made a Italian dish");
	}

	public ArrayList<String> getIngredients(){
		System.out.println("List goes here woo");
		return null;
	}

	public boolean haveIngredients(String[] list){
		return true;
	}
}
