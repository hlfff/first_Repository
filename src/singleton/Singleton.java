package singleton;

public class Singleton {
	private static Singleton instence;
	
	
	//单例模式需要将构造方法声明为私有的，这样，在其他类中，就不能通过new来实例化该对象
	//test
	//ss
	private Singleton(){}
	//懒汉式，线程不安全，如果同时有多个线程同时访问，对象会错乱
	private static Singleton getinstance(){
		if(instence == null){
			instence = new Singleton();
		}
		return instence;
	}
	//线程安全的懒汉式，加上同步，会降低效率
	private static synchronized Singleton getinstance1(){
		if(instence == null){
			instence = new Singleton();
		}
		return instence;
	}
	
	//双重校检锁
	private static volatile Singleton instence0;
	private static Singleton getinstence4(){
		if(instence0 == null){
			synchronized(Singleton.class){
				if(instence0 == null){
					instence0 = new Singleton();
				}
			}
		}
		return instence0;
	}
	
	
	
	//饿汉式 ，线程安全
	private static Singleton instence2 = new Singleton();
	private static Singleton getinstence2(){
		return instence2;
	}
	
	//静态内部类   饿汉式在类被装载时就被初始化了，次方法，需要使用时才会加载
	public static class SingletonHodler{
		private static final Singleton instence3 = new Singleton();
	}
	private static Singleton getinstence3(){
		return SingletonHodler.instence3;
	}
	
	
	
}
