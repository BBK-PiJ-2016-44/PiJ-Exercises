// Exercise 2

public class PhoneLauncher { 
	private String type = null;
	public static void main(String[] args) { 
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();		
	}
	
	public void launch() { 
		SmartPhone myPhone = new SmartPhone("Nokia");
		myPhone.call("012345678910");
		
		myPhone.call("001234565764");
		
		myPhone.ringAlarm();
		
		myPhone.playGame("Snake");
		
		myPhone.browseWeb("Google");
		
		System.out.println("Position is: " + myPhone.findPosition());
		
		type = myPhone.getBrand();
		System.out.println("Phone type: " + type);
	}
}