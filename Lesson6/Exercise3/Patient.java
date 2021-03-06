// Exercise 2 - Patient class

public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to next patient
		this.prevPatient = null; // Pointer to previous patient
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
	
	public Patient getPrevPatient() { 
		return prevPatient;
	}
	
	public void setPrevPatient(Patient newPatient) { 
		prevPatient = newPatient;
	}
	
	public String print(){ 
		return "Name: " + name + " Age: " + age + " Illness: " + illness;
	}
}
