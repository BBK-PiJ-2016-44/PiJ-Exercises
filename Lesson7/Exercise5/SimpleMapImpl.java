public class SimpleMapImpl implements SimpleMap { 

	private static final int Size = 1000;
	private String[] = mapArray;
	
	public SimpleMapImpl() { 
		mapArray = new String[Size];
	}
	
	public void put(int key, String name) { 
		if (mapArray[key] == null) {             // If key doesn't already exist..
			mapArray[key] = name;			// add name to that key
			System.out.println("Added" + name + " to key [" + key + "].");
		} else { 
			System.out.println( mapArray[key] + " already linked to key " + key + ".")
		}
	}

	public String get(int key) { 
		return mapArray[key];
	}
	
	public void remove(int key) { 
			System.out.println("Remove " + name + " key " + key);
		if (mapArray[key] != null) {
			mapArray[key] = null;
		} else { 
			System.out.println("Key " + key + " has no member");
		}	
	}
	
	public boolean isEmpty() {}
}