import java.util.ArrayList;

public interface Dish {

	void make();
	ArrayList<String> getIngredients();
	boolean haveIngredients(String[] list);
}
