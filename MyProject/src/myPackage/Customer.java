package myPackage;

public class Customer {
	
	int id;
	String name;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer mary = new Customer();
		mary.setId(10);
		mary.setName("Mary");
		
		System.out.println("Hello, I am " + mary.getName() + ". My ID is " + mary.getId());
	}

}
