package factory;

public class BeijingPizza extends Pizza{
	public BeijingPizza() {
		name = "��������";
		dough = "��Ƥ";
		sauce = "��Ȼ";
		toppings.add("��е�ζ");
	}
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
	
}
