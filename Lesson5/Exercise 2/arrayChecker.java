// Array Checker

public class arrayChecker { 
		public boolean isSymmetrical (int[] theArray) {
			int size = theArray.length;
			for (int i=0; i < size/2 ; i++) {
				if (theArray[i] != theArray[size-i-1]){
					return false;
				}
			}
		return true;
		}
		
		public int[] reverse(int[] theArray) { 
			return null;
		}
}