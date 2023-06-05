package array;

public class Array5 {

	public static void main(String[] args) {

		int [] a= {5,20,15,20,25,30};
		
		int num=20;
		
		findElementInArray(a,num);
		
		
	}

	private static void findElementInArray(int[] a, int num) {
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num) // check the number in array list of a given index number are more time in array then the use this ..
			{
				count++;
				System.out.println("found at index"+i);
			}
			
		}
		if(count==0)
			System.out.println("not found");
		
	}

}
