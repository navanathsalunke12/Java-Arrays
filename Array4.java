package array;

public class Array4 {

	public static void main(String[] args) {
		
 int [] a= {5,10,15,20,15,30};
 
 int num=20;
 
 int index=findIndexElementInArray(a,num);  // create method and pass the parameter
 
 if(index==-1)
	 System.out.println("not found");
 else
	 System.out.println("found at index " +index);

	}

	private static int findIndexElementInArray(int[] a, int num) {
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				return i;    // return value of i
			
		}
		return -1;  // return value of -1 becoz positive number are the  index of the array
	}

}
