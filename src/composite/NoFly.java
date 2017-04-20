package Composite;
//不可以飞行模式，实现Fly接口，多态。
public class NoFly implements Fly{

	@Override
	public void fly() {
		System.out.println("NoFly");
		
	}

}
