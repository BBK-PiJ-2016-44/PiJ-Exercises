// Exercises 1 - Executable code 

public class SupermarketTest { 
	
	public static void main(String[] args) { 
		SupermarketTest Launcher = new SupermarketTest();
		Launcher.launch();
	}
	
	public void launch() { 
		Supermarket tesco = new Supermarket();
		Person nick = new Person("Nick", 23);
		tesco.addPerson(nick);
		
		Person toServe1 = tesco.servePerson();
		System.out.println("Serving: " + toServe1.getName());
		
		Person juliet = new Person("Person A", 28);
		tesco.addPerson(juliet);
		
		Person chris = new Person("Person B", 26);
		tesco.addPerson(chris);
		
		Person dave = new Person("Person C", 26);
		tesco.addPerson(dave);
		
		Person toServe2 = tesco.servePerson();
		System.out.println("Serving: " + toServe2.getName());
		Person toServe3 = tesco.servePerson();
		System.out.println("Serving: " + toServe3.getName());
		Person toServe4 = tesco.servePerson();
		System.out.println("Serving: " + toServe4.getName());
		
	}
}
		
