package array;

public class leaderElement {

	public static void main(String[] args) {

		int [] a= {12,11,99,55,77,33,89,66,33};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])  // i element are the less than j element to right side then element are the leader element
					         // i element are the greater than right then count++;
				count++;
			}
			if(count==0)
				System.out.print(a[i]+" ");
		}
	}

}
