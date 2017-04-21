package decoration;

/**
 * ×°ÊÎÕß
 * @author º«Áú·É
 *
 */
public  class Mocha extends CondimentDecorator{
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "Mocha";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.00 + beverage.cost();
	}
}
