package decoration;

/**
 * ��װ���ߣ����췽�������������
 * @author ������
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
