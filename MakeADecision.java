import java.util.ArrayList;
import java.util.Random;

public class MakeADecision {
    public static void main(String args[]){
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