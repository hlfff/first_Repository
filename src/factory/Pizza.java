package factory;

import java.util.ArrayList;

/**
 * ÅûÈøµÄ»ùÀà
 * @author º«Áú·É
 *
 */

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public void prepare(){
		System.out.println("Pizza " + name);
		System.out.println("Adding dough" + dough);
		System.out.println("Adding sauce" + sauce);
		System.out.println("Adding toppings");
		for(int i = 0 ; i < toppings.size(); i++){
			System.out.println(toppings.get(i));
		}
	}
	public void bake(){
		System.out.println("bake for 25 min at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("place Pizza in offlcial pizzaStors box");
	}
	public String getName(){
		return name;
	}
}
