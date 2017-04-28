package factory;

public class BeijingPizza extends Pizza{
	public BeijingPizza() {
		name = "北京披萨";
		dough = "厚皮";
		sauce = "孜然";
		toppings.add("洋葱调味");
	}
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
