// Interface of a simple map from integers to strings

public interface SimpleMap { 
	/** 
	 * Puts a new String in the map
	 *
	 * If the the key is already in the map, nothing is done.
	 */
	 void put(int key, String name);
	 
    /** 	
     * Returns the name associated with that key,
	 * or null if there is none.
	 */
	 String get(int key);
	 
	/** 
     * Removes a name from the map. Future calls to get(key)
     * will return null for this key unless another 
	 * name is added with the same key.
	 */
	void remove(int key);

	/** 
	 * Returns true if the are no workers in the map.
	 * false otherwise
	 */
	boolean isEmpty(); 
}