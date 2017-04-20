package ssss;

public abstract class Duck {
	Fly fly;

	public void swim(){
		System.out.println("снс╬");
	}

	public void performfly(){
		fly.fly();
	}
	public abstract void display();
	
	public void setFly(Fly fly){
		this.fly = fly;
	}
	
}
