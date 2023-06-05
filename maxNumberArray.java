package array;

public class maxNumberArray {

	public static void main(String[] args) {

		int [] a= {5,100,12,45,45};
		
		int max=Integer.MIN_VALUE; // find max value compare to min value of int 
		// int max=a[0];
		
		int min=Integer.MAX_VALUE; // find min value compare to max value of int 
		// int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)     // compare the array list first element to max value means the min value of int , aray element are max then store the value of max
				max=a[i];
			if(a[i]<min) // 
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
