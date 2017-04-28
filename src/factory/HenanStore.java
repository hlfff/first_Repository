package factory;

public class HenanStore extends PizzaStore{
	
	@Override
	Pizza createPizza(String pizzaType) {
		if(pizzaType.equals("henanPizza")){
			return new HenanPizza();
		}else if(pizzaType.equals("henanPizza2")){
			return new HenanPizza2();
		}else
		return null;
	}
		
	
	
}
