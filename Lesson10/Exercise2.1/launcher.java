// Exercise 2.1 
public class Ex21 { 
	public static void main (String[] args){
		Ex21 ex = new ex21();
		int n = 10;
		System.out.println(ex.factorial(n));
	

		int factorial(int n) { 
			if (n >= 1) { 
				return n * factorial(n-1);
			} else { 
				return n;
			}
		}
	}
}