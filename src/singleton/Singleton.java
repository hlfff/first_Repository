package singleton;

public class Singleton {
	private static Singleton instence;
	
	
	//����ģʽ��Ҫ�����췽������Ϊ˽�еģ����������������У��Ͳ���ͨ��new��ʵ�����ö���
	//test
	//ss
	private Singleton(){}
	//����ʽ���̲߳���ȫ�����ͬʱ�ж���߳�ͬʱ���ʣ���������
	private static Singleton getinstance(){
		if(instence == null){
			instence = new Singleton();
		}
		return instence;
	}
	//�̰߳�ȫ������ʽ������ͬ�����ή��Ч��
	private static synchronized Singleton getinstance1(){
		if(instence == null){
			instence = new Singleton();
		}
		return instence;
	}
	
	//˫��У����
	private static volatile Singleton instence0;
	private static Singleton getinstence4(){
		if(instence0 == null){
			synchronized(Singleton.class){
				if(instence0 == null){
					instence0 = new Singleton();
				}
			}
		}
		return instence0;
	}
	
	
	
	//����ʽ ���̰߳�ȫ
	private static Singleton instence2 = new Singleton();
	private static Singleton getinstence2(){
		return instence2;
	}
	
	//��̬�ڲ���   ����ʽ���౻װ��ʱ�ͱ���ʼ���ˣ��η�������Ҫʹ��ʱ�Ż����
	public static class SingletonHodler{
		private static final Singleton instence3 = new Singleton();
	}
	private static Singleton getinstence3(){
		return SingletonHodler.instence3;
	}
	
	
	
}
