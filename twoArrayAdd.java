package array;

public class twoArrayAdd {

	public static void main(String[] args) {

		int [] [] a= {{1,2,3},
				{2,3,5},
				{5,6,7}};
		int [] [] b= {{1,2,3},
				{2,3,5},
				{5,6,7},
				{1,2,3}};
		
		
		int [] [] c=new int[3][3]; //  new array create //[a.lenght] [b.length] also use
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j]; // two array addition
			}
			
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
			System.out.print(c[i][j]+" "); // print c array
		}
			System.out.println();
		}
		
		
		
	}

}
