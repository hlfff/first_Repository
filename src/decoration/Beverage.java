package decoration;

/**
 * 饮料的基类
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
