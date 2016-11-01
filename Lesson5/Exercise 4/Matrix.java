// Exercise 4 - Creating Matrices

public class Matrix{ 	
	private int[][] myMatrix;

	public Matrix(int x, int y) {
		int i = 0;
		int j = 0;
		int[][] myMatrix = new int[x][y];
		for (i = 0;i < x; i++ ) {
			for (j = 0; j < y; j++) {
				myMatrix [i][j] = 1;
			}
		}
	}
}