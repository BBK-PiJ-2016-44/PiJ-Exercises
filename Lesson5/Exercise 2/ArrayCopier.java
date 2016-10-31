// Ex2 - Copying Arrays 

public class ArrayCopier{
	
		public int[] copy(int[] x) {
			int i = 0;
			int[] temp = new int[x.length];
			for (i=0;i < x.length;i++) {
				temp[i] = x[i];
				
			}
			return temp;
		}
}

