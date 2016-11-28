// Exercise 1 SmartPhone, extends MobilePhone

public class SmartPhone extends MobilePhone { 

public SmartPhone(String brand){ // Allows access to getBrand in OldPhone
		super(brand);
	}
	/**
	 * Open a web browser
	 */
	public void browseWeb(String search){
		System.out.println("Searching for " + search);
	}
	/**
	 * Returns GPS position
	 */
	public String findPosition() { 
		String position = ("40.741895 -73.989308");
		return position;
	}
	
	@Override
	/** 
	 * Call international number if 00...
	 */
	public void call(String number) { 
		if (number.startsWith("00")) { 
			System.out.println("Calling " + number + " over the internet");
		} else { 
			super.call(number);
		}
	}
}
