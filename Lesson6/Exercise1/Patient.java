// Exercise 1 - Patient class

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient!
	}
	
	public Patient getPatient() { 
		return this;
	}
	
	public void setPatient(Patient newPatient) { 
		this.Patient = newPatient;
	}
	
	public Patient getNextPatient() { 
		return this.nextPatient;
	}
	
	public void setNextPatient(Patient newPatient) { 
		this.nextPatient = newPatient;
	}

}


