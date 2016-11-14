// Exercise 1 - PersonQueue class. This implements the PersonQueue interface, so can
// the methods insert and retrieve defined in PersonQueue.java

public class PersonQueueImpl implements PersonQueue { 

	private Person firstPerson = new Person();
	
	public void insert(Person insertPerson) { 
		if (firstPerson.getNextPerson() == null) { 
			firstPerson.setNextPerson(insertPerson);
		} else { 
			insertPerson.setNextPerson(firstPerson.getNextPerson());
			firstPerson.setNextPerson(insertPerson);
		}
	System.out.println(insertPerson.getName() + " joined the queue");
	}
	
	public Person retrieve() { 
		Person result;
		Person currentPerson = firstPerson;
		if (currentPerson.getNextPerson() == null) { 
			result = new Person("Empty", 0);
			System.out.println("Queue is empty"); 
			return result;
		} 
		
		while (currentPerson.getNextPerson().getNextPerson() != null) {
			currentPerson = currentPerson.getNextPerson();
		}
		
		result = currentPerson.getNextPerson();
		currentPerson.setNextPerson(null);
		return result;	
	}
}
		