package Composite;

public abstract class Duck {
	Fly fly;

	public void swim(){
		System.out.println("��Ӿ");
	}
	//����fly�ӿڵ����ã�����Fly���fly����
	public void performfly(){
		fly.fly();
	}
	public abstract void display();
	
	//��̬�����÷��з�ʽ.
	public void setFly(Fly fly){
		this.fly = fly;
	}
	
}
