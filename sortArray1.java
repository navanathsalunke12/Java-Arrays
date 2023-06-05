package array;

public class sortArray1 {

	public static void main(String[] args) {

		int [] a= {99,22,77,55,33,77};    // selection sort
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;   //  min is minimum index of array is i
			for(int j=i+1;j<a.length;j++)  // j index is i+1 and check all all element of array
			{
				if(a[j]<a[min]) // j index is less than min 
					min=j; // then j element store the min index
			}
			int temp=a[i];    // min index and i index swap
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
			
		{
			System.out.print(a[i]+" ");
		}
	}

}
