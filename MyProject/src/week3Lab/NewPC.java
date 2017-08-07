package week3Lab;

public class NewPC {

	String pcModel;
	Processor processor;
	GraphicsCard graphicsCard;
	
	public String getPcModel() {
		return pcModel;
	}

	public String getPcSpecs() {
		StringBuffer PcSpecs = new StringBuffer();
		PcSpecs.append(" PC Specs ");
		PcSpecs.append(processor.getPartID());
		PcSpecs.append(graphicsCard.getPartID());

		return PcSpecs.toString();
	}
	

	
}
