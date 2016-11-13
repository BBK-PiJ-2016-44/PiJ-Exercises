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
		this.nextPatient = null; // Pointer to another patient
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getIllness() {
		return illness;
	}
	
	//public void setPatient(Patient newPatient) { 
	//	this.nextPatient = newPatient;
	//}
	
	public Patient getNextPatient() { 
		return nextPatient;
	}
	
	public void setNextPatient(Patient newPatient) { 
		nextPatient = newPatient;
	}

}


