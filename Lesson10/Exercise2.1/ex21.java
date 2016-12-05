// Exercise 2.1 
public class ex21 { 
	public static void main (String[] args){
		ex21 ex = new ex21();
		int n = 5;
		System.out.println(ex.factorial(n));
		
		
		// Iterative method
		if (n == 1) {
			System.out.println(n);
		} else { 
			int x = 2;
			int t = 1;
			while (x <= n) { 
				t = t * x; 
				x++;
			}
			System.out.println(t);
		}
	}
	
	// Recursive method
	int factorial(int n) { 
		if (n > 1) { 
			return n * factorial(n-1);
		} else { 
			return n;
		}
	}
}