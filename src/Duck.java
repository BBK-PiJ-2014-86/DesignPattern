
public class Duck {

	protected FlyBehavior flybehavior;
	protected QuackBehavior quackbehavior;
	
	public Duck () {
		this.flybehavior = new FlyWithWings();
		this.quackbehavior = new Quack();
	}
	
	public void performFly() {
		flybehavior.fly();
	}
	
	public void performQuack() {
		quackbehavior.quack();
	}
	
	public void roamAround(int speed) {
		
		performFly();
		performQuack();
	}

	// comment
	
	public void setFlyBehavior (FlyBehavior fb) {
		this.flybehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		this.quackbehavior = qb;
	}
	
	public void display () {
		System.out.println("I am a Duck");
		
	}
	
}
