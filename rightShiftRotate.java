package array;

public class rightShiftRotate {

	public static void main(String[] args) {
int [] a= {11,22,33,44,55,66};
			
		int temp=a[a.length-1]; // rightshift rotate  a[a.length-1] is a last element of array
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp; // a[0]is array of first element 
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	
	}

}
