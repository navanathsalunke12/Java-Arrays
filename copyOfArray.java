package array;

public class copyOfArray {

	public static void main(String[] args) {

		int [] a= {5,10,15,20,25,30};   // {} is object and //  a is reference 
		int[] b=new int[a.length]; // copy of the array of the a   // create new object by defult value  and b is reference 
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		b[1]=100; // change the b array their are no effect of array a
		 
		for(int i=0;i<a.length;i++)
		
			System.out.print(a[i] +" "); // print the array list a
		System.out.println();
		
		
		for(int i=0;i<a.length;i++)
		
			System.out.print(b[i]+" "); // print the array list b
		System.out.println();
		
	}

}
