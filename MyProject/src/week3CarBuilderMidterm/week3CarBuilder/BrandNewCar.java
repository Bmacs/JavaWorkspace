package week3CarBuilderMidterm.week3CarBuilder;

public class BrandNewCar {

	String carName;
	Chassis chassis;
	Body body;
	private static BrandNewCar uniqueInstance;

	public static BrandNewCar getInstance() {
		if( uniqueInstance == null )
			uniqueInstance = new BrandNewCar();
		return uniqueInstance;
	}

	public BrandNewCar() {
		chassis.getPartID();
		body.getPartID();
	}

	public String getCarName() {
		return carName;
	}
	
	public String getCarSpecs() {

		StringBuffer carSpecs = new StringBuffer();
		carSpecs.append(" Today's car -> ");
		carSpecs.append(" Specification ");
		carSpecs.append(this.chassis.getPartID() + ", ");
		carSpecs.append(this.body.getPartID() + ", ");
		
		return carSpecs.toString();
	}
}
