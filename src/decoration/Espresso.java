package decoration;

/**
 * ��װ���ߣ����췽�������������  ͨ��װ���߸���װ��������¹��ܣ��Դ˴���̳е����ã��ȼ̳и��е��ԣ��̳����̫�󣬲����ں���ά��
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
