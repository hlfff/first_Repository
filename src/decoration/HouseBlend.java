package decoration;
/**
 * 被装饰者，构造方法中添加描述。
 * @author 韩龙飞
 *
 */
public class HouseBlend extends Beverage{
	
	public HouseBlend(){
		description = "House Blend";
	}
	
	@Override
	public double cost() {
		
		return 8.00;
	}

}
