package decoration;

/**
 * ���ϵĻ���
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
