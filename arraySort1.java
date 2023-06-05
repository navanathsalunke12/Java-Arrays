package array;
import java.util.Arrays;
public class arraySort1 {

	public static void main(String[] args) {
		
	
			int [] a= {11,33,4,55,5,88,23,99,111}; // bouble sort
			                                 
			for(int j=0;j<a.length-1;j++)
			{
			for(int i=0;i<a.length-1-j;i++)
			{
				
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			}
			
			System.out.println(Arrays.toString(a));
		
	

	}

}
