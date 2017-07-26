package week2;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		System.out.println(" ");
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		System.out.println(" ");
		
		Duck wizard = new WizardDuck();
		wizard.performFly();
		wizard.performQuack();
	}

}
