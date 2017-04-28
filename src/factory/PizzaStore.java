package factory;

/**
 * ���������̵�Ļ��࣬�����������ܣ��Լ�һ�����󷽷�
 * @author ������
 *
 */
public abstract class PizzaStore {
	/**
	 * ������Ϊ����仯�������ڻ�����ʵ�֣������ù������Ǹ������ڵ����������ң�������֪������������һ��Pizza�����Կ��Խ��
	 * @param pizzaType
	 */
	public void orderPizza(String pizzaType){
		Pizza pizza;
		
		
		pizza = createPizza(pizzaType);
		
		pizza.prepare();
		//ÿһ��Pizza�����඼������д��������������㲻ͬ����������
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
	}
	/**
	 * ��������ʵ�ִ˷�����������������
	 * @param pizzaType
	 * @return
	 */
	abstract Pizza createPizza(String pizzaType);
	
}
