public class HashUtilities { 
	
	public static int shortHash(int input) { 
		return Math.abs(input % 1000);  // Remainder when divided by 1000 
	}
}

