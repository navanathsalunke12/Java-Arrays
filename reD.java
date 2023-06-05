package array;

public class reD {

	public static void main(String[] args) {
		

			int [] a= {10,10,10,20,30,40,50,30,60};
			
			int [] b=removeDupli(a);
			for(int i=0;i<b.length;i++)
				System.out.print(b[i]+" ");
			
			
			
			
		}

		private static int[] removeDupli(int[] a) {
			
			int originalCount=0;
			for(int i=0;i<a.length;i++)
			{
				int similarCount=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						similarCount++;
					}
				}
				if(similarCount==0)
				
					originalCount++;
				
				
			}
			
			int [] org=new int[originalCount];
			int p=0;
			for(int i=0;i<a.length;i++)
			{
				int similarCount=0;
				for(int j=i+1;j<a.length;j++) 
				{
					if(a[i]==a[j])
					{
						similarCount++;
					}
				}
				if(similarCount==0)
				{
					org[p]=a[i];
					p++;
				}
			}
			
			
			
			
			return org;

	}

}
