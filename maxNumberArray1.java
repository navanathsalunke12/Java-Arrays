package array;

public class maxNumberArray1 {

	public static void main(String[] args) {

		int [] a= {12,23,45,567,65}; // find second max number
		int max =Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2 && a[i]<max) // check condition
				max2=a[i];
		}
		System.out.println("max "+max);
		System.out.println("max2 "+max2);

	}

}
