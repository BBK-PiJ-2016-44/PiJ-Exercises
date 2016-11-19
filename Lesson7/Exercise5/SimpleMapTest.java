// Simple Map test

public class SimpleMapTest{ 
	
	public static void main (String[] args){
		SimpleMapTest test = new SimpleMapTest();
		test.launch();
	}
	
	
	public void launch() { 
		SimpleMapImpl impl = new SimpleMapImpl();
		
		// Adding members
		
			boolean quit = false;
			String name;
			int hash, smallHash;
			System.out.println("Adding names");
			System.out.println("Enter name to add: ");
			
			while (!quit) { 
			name = System.console().readLine();
			if (!name.equals("quit")) { 			
				hash = name.hashCode();                      // Hash the input
				smallHash = HashUtilities.shortHash(hash);   // shortHash input (between 0-1000)
				impl.put(smallHash, name);         	         // add to SimpleMapimpl
			
			} else {
				quit = true;
			}
		}
		
		// Getting members' names
		quit = false;
		String key;
		int intKey;
		System.out.println("Enter key to get name");
		
		while (!quit) { 
			key = System.console().readLine();
			if (!key.equals("quit")) {  
				intKey = Integer.parseInt(key);
				System.out.println("Key " + key + " is " + impl.get(intKey));
			} else { 
				quit = true;
			}
		}
		
		// Removing a member 
		quit = false;
		String removeKey;
		int removeIntKey;
		System.out.println("Enter the key of the member to remove: ");
		
		while (!quit) { 
			removeKey = System.console().readLine();
			if (!removeKey.equals("quit")) { 
				removeIntKey = Integer.parseInt(removeKey);
				System.out.println("Removing " + impl.get(removeIntKey));
				impl.remove(removeIntKey);
			} else { 
				quit = true;
			}
		}
		
	}
}