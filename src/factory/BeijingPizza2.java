package factory;

public class BeijingPizza2 extends Pizza{
	public BeijingPizza2() {
		name = "��������2";
		dough = "��Ƥ2";
		sauce = "��Ȼ2";
		toppings.add("��е�ζ2");
	}
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
