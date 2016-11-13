public class Launcher { 
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		HospitalManager manager = new HospitalManager();
		launcher.launch();
	}
	
	private void launch() {
	
		
		
		//Patient nick = new Patient("Nick", 23, "Coolness");
		//manager.addPatient(nick);
		
		//Patient iulia = new Patient("Iulia", 24, "Old age");
		//manager.addPatient(iulia);
		
		
        Patient patient1 = new Patient("John", 33, "Tuberculosis");
        manager.patientListStart = patient1;

        Patient patient2 = new Patient("Mary", 66, "Meningitis");
        manager.addPatient(patient2);
        Patient patient3 = new Patient("Sophia", 16, "Headache");
        manager.addPatient(patient3);
        Patient anotherPatient = new Patient("Jane", 26, "Broken leg");
        manager.addPatient(anotherPatient);
        Patient anotherPatientTwo = new Patient("Tom", 16, "Shoulder");
        manager.addPatient(anotherPatientTwo);
        Patient patient6 = new Patient("Clark", 48, "Ears");
        manager.addPatient(patient6);
        Patient patient7 = new Patient("John", 34, "Weight");
        manager.addPatient(patient7);
        Patient patient8 = new Patient("Jim", 84, "Knees");
        manager.addPatient(patient8);
        Patient patient9 = new Patient("Benny", 98, "Cold");
        manager.addPatient(patient9);
        Patient patient10 = new Patient("Debs", 77, "Cat");
        manager.addPatient(patient10);

        manager.printPatients();
//		System.out.println(iulia.name + " is " + iulia.age + " and suffers from " + iulia.illness);
//		System.out.println(nick.name + " is " + nick.age + " and suffers from " + nick.illness);

	}
}	