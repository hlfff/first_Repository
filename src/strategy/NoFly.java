package strategy;

public class NoFly implements Fly{
	//ʵ����Ϊ�ӿڣ�Ҳ�������㷨������ʵ���˴˽ӿڵ��࣬����ʵ�ִ˷���������ʹ����������ʱ����������Ĳ�ͬ��ʵ�ֲ�ͬ�ķ�����
	@Override
	public void fly() {
		System.out.println("NoFly");
		
	}

}
