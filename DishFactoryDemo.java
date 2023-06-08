public class DishFactoryDemo {
	
	public static void main(String[] args){
		MakeADecision decision = new MakeADecision();
		String decided = decision.makeADecision();
		if (decided == "mexican"){
			Mexican mexDish = new Mexican();
			System.out.println(mexDish);
		}
		


	}

}
