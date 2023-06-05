package array;

public class twoArrayMulti {

	public static void main(String[] args) {

int [] [] a= {{1,2,3},
		{4,2,1}};

int [] [] b= {{2,3},
		       {3,4},
{3,5}};		



int [] [] c=new int [a.length][a.length]; //  length are use [a.length][b[0].length]  also use


for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
		for(int k=0;k<b.length;k++)
		{
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
			
		}
	}
	}


for(int i=0;i<c.length;i++)
{
for(int j=0;j<c[i].length;j++)
{
System.out.print(c[i][j]+" ");	
}
System.out.println();
}

	}

}
