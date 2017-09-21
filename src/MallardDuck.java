
public class MallardDuck extends Duck{

	public MallardDuck () {
		this.flybehavior = new FlyWithWings();
		this.quackbehavior = new Squeak();
	}
	
	public void display () {
		System.out.println("I am a MallardDuck");
	}
}
