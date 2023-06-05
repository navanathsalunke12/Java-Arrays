package array;

public class EvenArrayFirstSort {

	public static void main(String[] args) {

		int [] a= {12,34,56,7,-65,44,34,99,-4};
		
		for(int i=0;i<a.length;i++)
		
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2==0 && a[j]%2!=0) // odd integer are the array are first then the even
				{                            // even integer first then use condition is a[i]!=0 && a[j]==0
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
