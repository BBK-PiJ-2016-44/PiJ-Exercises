// Exercise1 - Person class

public class Person {
	
	private String name;
	private int age;
	private Person nextPerson;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null; // Pointer to next Person
	}
	
	public Person() { 
		nextPerson = null;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person getNextPerson() { 
		return nextPerson;
	}
	
	public void setNextPerson(Person newPerson) { 
		nextPerson = newPerson;
	}	
}
