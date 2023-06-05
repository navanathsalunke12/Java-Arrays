package array;

public class arrayTwoAdd {

	public static void main(String[] args) {

		int [] a= {11,33,55,77};
		int [] b= {22,44,66,88,99};
		
		int [] c=new int[a.length+b.length]; // create new array and the lenght is a and b array
		
		int j=0;
		for(int i=0;i<a.length || i<b.length;i++)  // i< c.length use 
		{
			if(i<a.length)
			{
				
				c[j]=a[i];    // a array put the value in c array and index is ++
				j++;
			}
			
			if(i<b.length)
			{
				c[j]=b[i];  // b array put the value in c array and the index is ++ 
				j++;
			}
			
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" "); // print the c array
		}
	}

}
