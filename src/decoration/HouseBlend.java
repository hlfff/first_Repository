package decoration;
/**
 * ��װ���ߣ����췽�������������
 * @author ������
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
