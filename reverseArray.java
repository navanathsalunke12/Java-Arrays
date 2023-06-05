package array;

public class reverseArray {

	public static void main(String[] args) {

		
		int [] a= {5,10,15,20,25,30}; //  print reverse array 
		int i=0;
		int j=a.length-1;
		
		while(i<j)  // using while loop
		{ 
			int temp=a[i];   // using swaping 
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
			
		}
		
		for( i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}

}
