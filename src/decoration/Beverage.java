package decoration;

/**
 * ���ܷ���ʱ��ʹ�úܶ��������࣬���ӳ���ĸ��Ӷȡ�ͬʱ,ʹ�ü̳�ʵ�ֹ�����չ,���Ǳ����Ԥ����Щ��չ����,��Щ�����Ǳ���ʱ��ȷ����,�Ǿ�̬�ġ�
 * 
 *  ��Ȼ��װ���ߺ�װ����ӵ�й�ͬ�����࣬��������ֻ��Ϊ�˼̳й�ͬ�����ͣ���������Ϊ��
 * @author ������
 *
 */
public abstract class Beverage {
	String description = "UnKnow Beverage";
	
	/**
	 * ���ϵ�����
	 * @return ���ϵ�������
	 */
	public String getDescription(){
		return description;
	}
	/**
	 * ��Ǯ
	 * @return
	 */
	public abstract double cost();
	
	
}
