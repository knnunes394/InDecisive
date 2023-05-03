public class Mexican implements Dish {
	
	public void make(){
		System.out.println("Made a mexican dish");
	}

	public void getIngredients(){
		System.out.println("List of ingredients here");
	}

	public boolean haveIngredients(String[] list){
		return true;
	}
}
