//Exercise 1
// Top section of code is repeated, bottom section is tidier
 
 
// /*  public class Comparator {
	// public int getMax(int n, int m) {
		// if (n > m) {
			// return n;
		// } else {
			// return m;
		// }
	// }
	
	// public double getMax(double d1, double d2) {
		// if (d1 > d2) {
			// return d1;
		// } else {
			// return d2;
		// }
	// }
	
	// public String getMax(String number1, String number2) {
		// int n1 = Integer.parseInt(number1);
		// int n2 = Integer.parseInt(number2);
		// if (n1 > n2) {
			// return number1;
		// } else {
			// return number2;
		// }
	// }
// } */
//**********************************************************************

public class Comparator { 
	public double getMax(String number1, String number2) { 
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		double max = getMax( n1, n2);
		return max;
	}
	
	public double getMax(double d1, double d2) { 
		if (d1 > d2) { 
			return d1;
		} else { 
			return d2;
		}
	}
}
