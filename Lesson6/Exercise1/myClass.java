public class Launcher { 
	public static void main(String[] args) {
		Launcher launcer = new Launcher();
		launcher.launch();
	}
	
	private void launch() {
	
		HospitalManager manager = new HospitalManager();
		
		Patient nick = new Patient("Nick", 23, "Coolness");
		manager.addPatient(nick);
		
		Patient iulia = new Patient("Iulia", 24, "Old age");
		manager.addPatient(iulia);
//		System.out.println(iulia.name + " is " + iulia.age + " and suffers from " + iulia.illness);
//		System.out.println(nick.name + " is " + nick.age + " and suffers from " + nick.illness);

	}
}	