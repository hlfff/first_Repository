package Composite;

public class saaaa extends Duck{
	
	saaaa(){
//		 fly = new CanFly();
	}
	public static void main(String[] args) {
		saaaa a = new saaaa();
		a.display();
//		a.performfly();
		//可以动态设置飞行模式。
		a.setFly(new NoFly());
		a.performfly();
	}
	@Override
	public void display() {
		System.out.println("display");	
	}
}
