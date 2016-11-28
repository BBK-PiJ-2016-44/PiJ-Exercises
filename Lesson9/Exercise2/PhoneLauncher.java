// Exercise 2

public class PhoneLauncher { 
	private String type = null;
	public static void main(String[] args) { 
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();		
	}
	
	public void launch() { 
		MobilePhone yourPhone = new SmartPhone("Nokia"); 
		//Creates a MobilePhone object with the SmartPhone constructor
		SmartPhone myPhone = (SmartPhone) yourPhone;
		// Casts the MobilePhone to a SmartPhone
		System.out.println(" ");
		myPhone.call("012345678910");
		
		myPhone.call("001234565764");
		
		myPhone.ringAlarm();
		
		myPhone.playGame("Snake");
		
		myPhone.browseWeb("Google");
		
		System.out.println("Position is: " + myPhone.findPosition());
		
		type = myPhone.getBrand();
		System.out.println("Phone type: " + type);
		System.out.println(" ");
		testPhone(myPhone);
		
	}
	
	public void testPhone(Phone myPhone){ // Only called with Phone parm
		System.out.println("Calling testPhone method...");
		// OldPhone method 
		myPhone.call("012345678910");
		// No other methods can be called from here unless cast to SmartPhone
		
		//MobilePhone methods
		
		//myPhone.ringAlarm();
		//myPhone.playGame("Snake");
		
		//SmartPhone methods  
		
		//myPhone.browseWeb("Google");
		//myPhone.call("0012345678910");
		//System.out.println("Position is: " + myPhone.findPosition());
		
		//type = myPhone.getBrand();
		//System.out.println("Phone type: " + type);		
	}
}