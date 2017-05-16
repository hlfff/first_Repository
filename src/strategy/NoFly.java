package strategy;

public class NoFly implements Fly{
	//实现行为接口，也可以是算法。所有实现了此接口的类，都会实现此方法，可以使程序在运行时，根据子类的不同，实现不同的方法。
	@Override
	public void fly() {
		System.out.println("NoFly");
		
	}

}
