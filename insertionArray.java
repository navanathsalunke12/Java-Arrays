package array;

public class insertionArray {

	public static void main(String[] args) {

		int [] a= {11,44,33,22,55,47};
		
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];  //  a[i] store the value of temp
			int j=i;  // j start with i
			for(;j>0;j--)
			{
				if(a[j-1]>temp)  // check condition
					a[j]=a[j-1]; //  condition true then a[j-1] store the a[j] positionww
				else
					break;
				
			}
			a[j]=temp;
			
		}
		
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}

}
