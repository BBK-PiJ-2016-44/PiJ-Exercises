//Exercise 4

public class ex4 { 
	public static void main (String[] args){
		ex4 ex = new ex4();
		String str;
		System.out.println("Enter string");
		str = System.console().readLine();
		
		System.out.println(ex.isPalindrome(str));
	}	
		
		
	boolean isPalindrome(String str) { 
		if (str.length() <= 1){ 
			return true;
		} else if (str.charAt(str.length() -1) == str.charAt(0)) { 
			return isPalindrome(str.substring(1, str.length() - 1));
		} else { 
			return false;
		}
	}
}



