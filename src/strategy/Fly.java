package strategy;
/**
 * 策略接口，添加某种需要动态改变的方法，或者行为，实现该接口，就相当于添加了一种算法，如果不使用此接口，违反了OO原则的对修改关闭原则
 * @author 韩龙飞
 *
 */
public interface Fly {
	public void fly();
}
