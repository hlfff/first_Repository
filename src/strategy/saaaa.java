package strategy;

public class saaaa extends Duck{
	
	saaaa(){
//		 fly = new CanFly();
	}
	public static void main(String[] args) {
		//��̬�ķ�ʽ���ó���������ʱ��������Ϊ
		Duck a = new saaaa();
		a.display();
//		a.performfly();
		a.setFly(new NoFly());
		a.performfly();
	}
	@Override
	public void display() {
		System.out.println("display");	
	}
}
