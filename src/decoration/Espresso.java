package decoration;

/**
 * 被装饰者，构造方法中添加描述。
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
