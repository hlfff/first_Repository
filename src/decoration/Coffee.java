package decoration;

public class Coffee {
	public static void main(String[] args) {
		//��̬�ļ��أ����ھ�̬�ı���
		
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + "�۸�" + beverage.cost());
		
		//����װ�������װ���ߡ�
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "�۸�" + beverage2.cost());
	}
}
