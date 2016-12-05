//Exercise 2.3

public class ex23 { 
	public static void main (String[] args){
		ex23 ex = new ex23();
		String str;
		int n;
		System.out.println("Enter number");
		str = System.console().readLine();
		n = Integer.parseInt(str);
		
		System.out.println("Hanoi(" + n + ") takes " + ex.hanoi(n) + " moves.");
		
	}
	// Using long will allow numbers up to 2^64-1. 
	long hanoi (long n) { 
		long result = 0;
		if (n > 0) { 
			result = 2*hanoi(n-1) + 1;
			return result;
		}
 		return result;
	}
	
}