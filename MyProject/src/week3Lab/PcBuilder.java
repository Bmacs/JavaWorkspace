package week3Lab;

public abstract class PcBuilder {
	
	NewPC newPC = new NewPC();


	public void buildGraphicsCard() {
		newPC.graphicsCard = new GraphicsCard();
	}
}
