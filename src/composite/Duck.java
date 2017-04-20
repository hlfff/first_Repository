package Composite;

public abstract class Duck {
	Fly fly;

	public void swim(){
		System.out.println("游泳");
	}
	//持有fly接口的引用，调用Fly里的fly方法
	public void performfly(){
		fly.fly();
	}
	public abstract void display();
	
	//动态的设置飞行方式.
	public void setFly(Fly fly){
		this.fly = fly;
	}
	
}
