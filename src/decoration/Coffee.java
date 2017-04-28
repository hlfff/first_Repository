package decoration;

public class Coffee {
	public static void main(String[] args) {
		//动态的加载，好于静态的编译
		
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "价格：" + beverage.cost());
		
		//给被装饰着添加装饰者。
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "价格" + beverage2.cost());
	}
}
