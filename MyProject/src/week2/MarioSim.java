package week2;

public class MarioSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquirrelMario mario = new SquirrelMario();
		mario.performFly();
		mario.performJump();
		mario.performYell();
		System.out.println();
		
		Luigi luigi = new Luigi();
		luigi.performFly();
		luigi.performJump();
		luigi.performYell();
		System.out.println();
		
		Koopa koopa = new Koopa();
		koopa.performFly();
		koopa.performJump();
		koopa.performYell();
	}

}
