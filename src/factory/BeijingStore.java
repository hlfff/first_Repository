package factory;

public class BeijingStore extends PizzaStore{

	@Override
	Pizza createPizza(String pizzaType) {
		if(pizzaType.equals("beijingPizza")){
			return new BeijingPizza();
		}else if(pizzaType.equals("beijingPizza2")){
			return new BeijingPizza2();
		}else
		return null;
	}

}
