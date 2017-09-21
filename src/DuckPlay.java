
public class DuckPlay {

	public static void main (String [] arg) {
		Duck mallard = new MallardDuck();
		Duck redhead = new RedheadDuck();
		
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
		
		redhead.display();
		redhead.performQuack();
	}
	
}
