package array;

public class pairArray {

	public static void main(String[] args) {

		int [] a= {1,2,3,1,1};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i])
				
			
			for(int j=i+1;j<a.length;j++)
			{
				
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			}
			}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i])
				
			
			for(int j=i+1;j<a.length;j++)
			{
				
				 if(a[i]!=a[j] && a[j]!=a[i]  )
				 {
					 
						 System.out.println(a[i]+" "+a[j]);	
				 }
			}
			}
		
		
		
		}
	}


