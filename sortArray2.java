package array;

public class sortArray2 {

	public static void main(String[] args) {

		int [] a= {11,34,54,66,77,8,25,66};
		
		for(int i=0;i<a.length;i++)
		{
			int j=i-1;
			for(;j>=0;j--)
			{
				if(a[j]<a[i])
					break;
					
			}
			
			rotate(a, j+1, i);
		}
			for(int i=0;i<a.length;i++)
				System.out.print(a[i] +" ");
			
		
	}
		public static void rotate(int[] a,int b,int z)
		{
			int temp=a[z];
			for(int i=z;i>b;i--)
			
				a[i]=a[i-1];
			
			a[b]=temp;
		}
	

}
