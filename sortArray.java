package array;

public class sortArray {

	public static void main(String[] args) {

		int [] a= {11,55,22,77,33,56,99};
		
		for(int i=0;i<a.length;i++) // sort array 
		{
			for(int j=i+1;j<a.length;j++)  // j is a always greater then use the i+1
			{
				if(a[i]>a[j]) // a[i] index element is greater than a[j] index element is condition is true then swap the element
				{
					int temp=a[i]; // swap the element
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");  // print the sort array
		}
	}

}
