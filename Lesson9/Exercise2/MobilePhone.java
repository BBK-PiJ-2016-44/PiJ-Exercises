// Exercise 1 MobilePhone class - extends OldPhone

public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand){ // Allows access to getBrand in OldPhone
		super(brand);
	}
	/**
	 * Turns on phone alarm
	 */
	public void ringAlarm() { 
		System.out.println("Ring Ring");
		System.out.println("Ring Ring");
	}
	/** 
	 * Launches a game 
	 */
	public void playGame(String game) { 
		System.out.println("Playing game: " + game);
	}
}