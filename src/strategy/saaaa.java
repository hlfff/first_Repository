package strategy;

public class saaaa extends Duck{
	
	saaaa(){
//		 fly = new CanFly();
	}
	public static void main(String[] args) {
		//多态的方式，让程序在运行时，决定行为
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
