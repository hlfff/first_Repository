package factory;

/**
 * 所有披萨商店的基类，包含订购功能，以及一个抽象方法
 * @author 韩龙飞
 *
 */
public abstract class PizzaStore {
	/**
	 * 订制行为不会变化，所以在基类中实现，他不用关心是那个子类在调用他。并且，他不用知道创建的是哪一种Pizza，所以可以解耦。
	 * @param pizzaType
	 */
	public void orderPizza(String pizzaType){
		Pizza pizza;
		
		
		pizza = createPizza(pizzaType);
		
		pizza.prepare();
		//每一个Pizza的子类都可以重写这个方法，以满足不同的制作需求。
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
	}
	/**
	 * 在子类中实现此方法，让子类做决定
	 * @param pizzaType
	 * @return
	 */
	abstract Pizza createPizza(String pizzaType);
	
}
