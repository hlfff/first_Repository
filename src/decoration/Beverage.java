package decoration;

/**
 * 功能繁多时，使用很多的子类过多，增加程序的复杂度。同时,使用继承实现功能拓展,我们必须可预见这些拓展功能,这些功能是编译时就确定了,是静态的。
 * 
 *  虽然被装饰者和装饰者拥有共同的子类，但是他们只是为了继承共同的类型，而不是行为。
 * @author 韩龙飞
 *
 */
public abstract class Beverage {
	String description = "UnKnow Beverage";
	
	/**
	 * 饮料的描述
	 * @return 饮料的描述，
	 */
	public String getDescription(){
		return description;
	}
	/**
	 * 价钱
	 * @return
	 */
	public abstract double cost();
	
	
}
