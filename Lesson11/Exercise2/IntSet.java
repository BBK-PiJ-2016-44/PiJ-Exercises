// Exercise 2
public interface IntSet{ 

	/**
	 * Adds a new int to the set; if it is there already, nothing happens
	 */ 
	void add(int x);

	/** 
	 * Returns true if the number is in the set, false otherwise
	 */
	boolean contains(int f);
	
	/**
	 * returns the same values as the former method, but for every element that is 
	 * checked, it prints its value on screen.
	 */
	boolean containsVerbose(int x); 
	
	/**
	 * Returns a string with the values of the elements in the set separated by commas.
	 */ 
	String toString();
}

