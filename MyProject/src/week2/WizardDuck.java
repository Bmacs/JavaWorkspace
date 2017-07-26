package week2;

public class WizardDuck extends Duck{
	public WizardDuck() {
		quackBehavior = new SignLanguage();
		flyBehavior = new FlyTeleport();
	}
	
	public void display() {
		System.out.println("Look's like a duck with a hat and a cape");
	}
}
