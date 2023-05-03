public class DishFactoryDemo {
	
	public static void main(String[] args){
		DishFactory dishFactory = new DishFactory();
		Dish mex = new Mexican();
		mex.make();
	}

}
