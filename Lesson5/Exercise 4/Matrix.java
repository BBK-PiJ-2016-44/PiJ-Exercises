// Exercise 4 - Creating Matrices

public class Matrix{ 	
	private int[][] myMatrix;

	public Matrix(int x, int y) {
		myMatrix = new int[x][y];
		for (int i = 0;i < x; i++ ) {
			for (int j = 0; j < y; j++) {
				myMatrix [i][j] = 1;
			}
		}
	}
	
	public void prettyPrint() { 
		System.out.println();
		for (int i = 0; i < myMatrix.length; i++) { 
			for (int j = 0; j < myMatrix[0].length; j++) { 
				System.out.print(myMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void setElement(int x, int y, int z) { 
		if (isValid(x,y)) { 
			myMatrix[x][y] = z;	
		}
	}
	
	
	
	
	
	// Useful methods 
	// get a count of elements in a string, seperated by a comma (csv format) 
	public int countNumbers(String str) { 
		int result = 0;
		for (int i = 0; i < str.length(); i++) { 
			if (str.charAt(i) == ',') {
				result++;
			}
		}
		return result + 1;
	}
	
	// Checks if a coordinate (int x,int y) lies within a matrix
	public boolean isValid(int x, int y) { 
		return (x >= 0 && x < myMatrix.length && y >= 0 && y < myMatrix[0].length);
	}
	
	
	
	
	
}