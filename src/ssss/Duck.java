package ssss;

public abstract class Duck {
	Fly fly;

	public void swim(){
		System.out.println("��Ӿ");
	}

	public void performfly(){
		fly.fly();
	}
	public abstract void display();
}
