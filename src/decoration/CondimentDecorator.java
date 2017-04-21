package decoration;

/**
 * 为了让装饰着和被装饰着一致，让所有的装饰者继承自本类，而本类 和所有的被装饰者都继承自共同的基类。
 * @author 韩龙飞
 *
 */
public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();
	

}
