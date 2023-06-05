package array;

public class minAvgArray {

	public static void main(String[] args) {


		int [] a= {3,7,90,20,5,50,40};
		//         i start with 0 index
		//         j   start with i index
		//           j
		//              j end of k less than
		//         k means the start the first 3 element then next 3 element
		
		int k=3;
		int min=Integer.MAX_VALUE;
	int	minIndex=0;
		for(int i=0;i<a.length-k+1;i++)  // i< a.length-k+1 because i is less then a.length -2
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				sum+=a[j]; // sum of j value 3 index
			}
			int avg=sum/k; // avg of 3 element 
			if(avg<min)
			{
				min=avg;  // avg store thr min
			minIndex=i;  // find the index of i of avg is calculate
			}
			
		}
		
		System.out.println(min);
		System.out.println(minIndex);
	}

}
