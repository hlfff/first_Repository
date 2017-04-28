package factory;

public class BeijingPizza2 extends Pizza{
	public BeijingPizza2() {
		name = "北京披萨2";
		dough = "厚皮2";
		sauce = "孜然2";
		toppings.add("洋葱调味2");
	}
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
