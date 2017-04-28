package factory;

public class BuyPizza {

	public static void main(String[] args) {
		PizzaStore store = new HenanStore();
		
		store.orderPizza("henanPizza2");
//		Pizza pizza = store.createPizza("henanPizza2");

		
		System.out.println("===============================");
		
		PizzaStore beijingStore = new BeijingStore();
		beijingStore.orderPizza("beijingPizza");
//		Pizza beijingPizza = beijingStore.createPizza("beijingPizza");

	}

}
