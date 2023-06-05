package array;

public class arrayMatrix {

	public static void main(String[] args) {

		int [][]a= {{1,2,3,4,5,6},
				{3,5,6,7,8,5},
				{6,7,8,5,4,4},
				{8,5,3,2,1,1}};
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			
				if(i!=0 && i!=a.length && j!=0 && j!=a[i].length-1) // sum of inner element
				//if(i==0 || i==a.length || j==0 || j==a[i].length-1) // sum of outerr element
				
					
					sum+=a[i][j]; // all array sum cna not be use if direct addition of array element
				
				
			}
		}
	System.out.println(sum);
	}
	

}
