// Ex2 - Copying Arrays 

public class ArrayCopier{
	
		public int[] copy(int[] x) {
			int i = 0;
			int[] temp = new int[x.length];
	//		int[] temp = new int[x.length + 5]; For source array being shorter
	//     	int[] temp = new int[x.length - 3]; For source array being longer
			for (i=0;i < x.length;i++) {
	//		for (i=0;i < x.length - 3;i++) { For source array being longer
				temp[i] = x[i];
				
			}
			return temp;
		}
}

