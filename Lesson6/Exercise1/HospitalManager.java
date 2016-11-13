// Exercise 1 - Hospital Manager Class

public class HospitalManager { 

	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		HospitalManager manager = new HospitalManager();
		manager.launch();
	}
	
	private void launch() {
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
        patientListStart = firstPatient;
		
        Patient patient2 = new Patient("Mary", 66, "Meningitis");
        addPatient(patient2);
        Patient patient3 = new Patient("Sophia", 16, "Headache");
        addPatient(patient3);
        Patient patient4 = new Patient("Jane", 26, "Broken leg");
        addPatient(patient4);
        Patient patient5 = new Patient("Tom", 16, "Shoulder");
        addPatient(patient5);
        Patient patient6 = new Patient("Clark", 48, "Ears");
        addPatient(patient6);
        Patient patient7 = new Patient("John", 34, "Weight");
        addPatient(patient7);
        Patient patient8 = new Patient("Jim", 84, "Knees");
        addPatient(patient8);
        Patient patient9 = new Patient("Benny", 98, "Cold");
        addPatient(patient9);
        Patient patient10 = new Patient("Debs", 77, "Cat");
        addPatient(patient10);
		
		printPatients();
		System.out.println("Number of patients: " + countPatients());
		
		
		// Delete patient 8
		System.out.println("Now try deleting patient 8");
		deletePatient(patient8);
		
		printPatients();
		System.out.println("Number of patients: " + countPatients());
		
		// Delete patient 1
	System.out.println("Now try deleting patient 1");
		deletePatient(firstPatient);
		
		printPatients();
		System.out.println("Number of patients: " + countPatients());
		
		
	}
		
	public void addPatient(Patient newPatient) {
		Patient pointer = patientListStart;
		if (pointer == null){ // The list is empty, add new patient to the first position.
			pointer = newPatient;
		} else {
			while (pointer.getNextPatient() != null){ // Move through list until at last patient..
				pointer = pointer.getNextPatient();
			}
			pointer.setNextPatient(newPatient); // Add new patient at the end of list.
		}
	}
	
	private void printPatients() {
        Patient printThisPatient = patientListStart; //Select first patient in list
        Patient nextPatient;
        do {
            System.out.println("NAME: " + printThisPatient.getName() +
                    "\t AGE: " + printThisPatient.getAge() +
                    "\tILLNESS: " + printThisPatient.getIllness());
            nextPatient = printThisPatient.getNextPatient();
            printThisPatient = nextPatient;  //Select next patient and repeat while next patient exists
        } while (nextPatient != null);
    }
	
	public boolean deletePatient(Patient patient) {
        Patient pointer = patientListStart;
        if (pointer == null){
            // patient not present as list empty
            return false;
        } else {
            if (pointer.getName().equals(patient.getName())){
                // first element is the patient we wish to delete
                patientListStart = pointer.getNextPatient();
                return true;
            } else {
                // look down the rest of the list
                while (pointer.getNextPatient().getName()!= patient.getName() && pointer != null){
                    pointer = pointer.getNextPatient();
                }
                if (pointer== null){
                    return false;
                } else {
                    pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
                    return true;
                }
            }
        }
    }
	
	private int countPatients() { 
		Patient firstPatient = patientListStart;
		Patient nextPatient;
		int count = 0;
		do { 
			count++;
			nextPatient = firstPatient.getNextPatient();
			firstPatient = nextPatient;
		} while (nextPatient != null);
		return count;
	}
}
