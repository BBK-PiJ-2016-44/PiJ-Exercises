//Exercise 2.2

public class ex22 { 
	public static void main (String[] args){
		ex22 ex = new ex22();
		String str;
		int n;
		System.out.println("Enter number");
		str = System.console().readLine();
		n = Integer.parseInt(str);
		
		System.out.println("Fib(" + n + ") = " + ex.fib(n));
		
	}
	int fib(int n){ 
		if ((n==1) || (n==2)) { // First 2 numbers in Fib are 1
			return 1;
		} else { 
			int result = fib(n-1) + fib(n-2); 
			return result;
		}
	}	
}