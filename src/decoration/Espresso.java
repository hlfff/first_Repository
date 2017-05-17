package decoration;

/**
 * 被装饰者，构造方法中添加描述。  通过装饰者给被装饰者添加新功能，以此代替继承的作用，比继承更有弹性，继承耦合太大，不利于后期维护
 * @author 韩龙飞
 *
 */
public class Espresso extends Beverage{
	
	public Espresso(){
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		
		return 10.00;
	}

}
