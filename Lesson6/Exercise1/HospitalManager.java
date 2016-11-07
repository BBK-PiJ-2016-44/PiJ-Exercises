// Exercise 1 - Hospital Manager Class

public class HospitalManager { 
	private Patient firstPatient = null;
	
	public void addPatient(Patient newPatient) { 
		if (firstPatient == null) { 
			firstPatient = newPatient;
			return;
		}
		Patient current = this.firstPatient;
		
  		while (current.getNextPatient() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPatient();
		}
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
	}
}
