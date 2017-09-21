
public class RedheadDuck extends Duck{

	public RedheadDuck() {
		this.flybehavior = new FlyNoWay();
		this.quackbehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I am a Redhead Duck!");
	}
}
