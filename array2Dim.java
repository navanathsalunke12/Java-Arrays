package array;

import java.util.Arrays;

public class array2Dim {

	public static void main(String[] args) {

		int [][] a= {{1,2,3},{1,3,4},{5,6,7}};
		
		for(int i=0;i<a.length;i++)
		{
			
			int [] b=a[i]; // 2d array convert the one D array
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[j]+" ");
			}
			System.out.println();
		}
	}

}
