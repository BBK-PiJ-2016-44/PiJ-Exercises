// Exercise 1 OldPhone class - implements Phone

public class OldPhone implements Phone { 
	
	private String brand = null;
	
	public OldPhone(String brand) { // Constructor for OldPhone
		this.brand = brand;
	}
	/**
	 * Returns the brand of the phone
	 */
	public String getBrand(){ 
		return brand;
	}
	/** 
	 * Calls a number
	 */
	public void call(String number) { 
		System.out.println("Calling : " + number);
	}
}	