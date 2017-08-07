package week3Lab;

public abstract class PcBuilder {
	
	NewPC newPC = new NewPC();

	public NewPC getNewPc() {
		return newPC;
	}

	public abstract void setPcModel();

	public void buildNewPc() {
		newPC = new NewPC();
	}

	public void buildGraphicsCard() {
		newPC.graphicsCard = new GraphicsCard();
	}

	public void buildProcessor() {
		newPC.processor = new Processor();
	}
}
