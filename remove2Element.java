package array;

public class remove2Element {

	public static void main(String[] args) {

		int [] a= {1,1,1,1,1,2,2,3,4};
		
	int [] n= {1,2,4};
	
	for(int i=0;i<n.length;i++)
	{
		a=remove(a,n[i]);
	}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	private static int[] remove(int[] a, int num) {
int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			
			{
				count++;
			}
			if(count==2)
			
			break;
			
		}
		int [] b=new int[a.length-count];
		int p=0;
		int removeCount=0;
		for(int i=0;i<a.length;i++)
		{
			if(removeCount==2 || a[i]!=num)
			{
				b[p]=a[i];
				p++;
			}
			else
				removeCount++;
				
		}
		
		
		
		return b;
	}

}
