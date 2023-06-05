package array;

import java.util.Arrays;

public class positiveArraySort {

	public static void main(String[] args) {

		int [] a= {12,-23,66,-98,66,-23,99};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{                            // positive integer are the first then the use condition a[i]<0 && a[j]>0 then odd first the condition is
				if(a[i]<0 && a[j]>0)  // positive integer to be right and then odd
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
	}
	}

}
