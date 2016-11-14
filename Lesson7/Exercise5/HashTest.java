public class HashTest{ 
	public static void main(String[] args) { 
	System.out.println("Enter string: ");
	String str = System.console().readLine();
	int hash = str.hashCode();
	int myHash = HashUtilities.shortHash(hash); 
	System.out.println("Big Hash: " + hash);
	System.out.println(myHash + " between 0 and 1000");  
	}
} 