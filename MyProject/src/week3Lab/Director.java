package week3Lab;

public class Director {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewPC pc = buildPC(new HighEndModel());
		System.out.println("Newly built PC: " + pc.getPcModel() + "." + pc.getPcSpecs());

	}
	
	public static NewPC buildPC(PcBuilder pcBuilder) {
		pcBuilder.buildNewPc();
		pcBuilder.setPcModel();
		pcBuilder.buildProcessor();
		pcBuilder.buildGraphicsCard();
		
		return pcBuilder.getNewPc();
	}
	

}
