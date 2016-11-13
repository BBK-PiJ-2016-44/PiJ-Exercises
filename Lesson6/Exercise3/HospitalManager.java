// Exercise 1 - Hospital Manager Class - Doubly-linked list

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
			newPatient.setPrevPatient(pointer); // Add a pointer from new patient to previous patient
		}
	}
	
	private void printPatients() {
        if (patientListStart == null) { 
		System.out.println("No patients");
		return;
		}
		
		System.out.println("\nPrinting forwards"); 
		printForwards();
		System.out.println("\nPrinting backwards");
		printBackwards();
		System.out.println();
		
		
	}
        
	
	private void printForwards() { 
		Patient printMe = patientListStart;
		
		while (printMe != null) {
			System.out.println(printMe.print());
			printMe = printMe.getNextPatient();
		}
	}
	
	private void printBackwards() {
		Patient printMe = patientListStart;
		
		while (printMe.getNextPatient() != null) { 
			printMe = printMe.getNextPatient();
		}
			
		while (printMe != null) { 
			System.out.println(printMe.print());
			printMe = printMe.getPrevPatient();
		}
		
	}
	
	
	
	
	
	
	
	public boolean deletePatient(Patient patient) {
		
        if (patientListStart == null){
            // patient not present as list empty
            return false;
        }
		
        if (patientListStart.getName().equals(patient.getName())){
            // first element is the patient we wish to delete
            patientListStart = patientListStart.getNextPatient();
			patientListStart.getNextPatient().setPrevPatient(patientListStart);
            return true;
        } 
        
		Patient pointer = patientListStart;
		
		while (pointer.getNextPatient() != null && pointer.getNextPatient().getName() != patient.getName()){ 
			//System.out.println(pointer.getNextPatient().print());
			pointer = pointer.getNextPatient(); // Go through list until end is reached or patient is reached
		}
		
		if (pointer.getNextPatient() == null){ 
			return false; // Patient not found
		} else { 
			Patient nextElement = pointer.getNextPatient().getNextPatient();
			pointer.setNextPatient(nextElement);
			nextElement.setPrevPatient(pointer);
			return true;
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