package Composite;
//可以飞行模式，实现Fly接口，多态。
public class CanFly implements Fly{

	@Override
	public void fly() {
		System.out.println("CanFly");
		
	}

}
