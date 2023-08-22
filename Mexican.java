import java.util.ArrayList;

public class Mexican implements Dish {
	
	public void make(){
		System.out.println("Made a mexican dish");
	}

	public ArrayList<String> getIngredients(){
		System.out.println("List of ingredients here");
		return null;
	}

	public boolean haveIngredients(String[] list){
		return true;
	}
}
