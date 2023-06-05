package array;

public class rightShift {

	public static void main(String[] args) {

		int [] a= {11,22,33,44,55,66};
		
		
		for(int i=a.length-1;i>0;i--) // rightshift always i-- and the i > is index 0 and i=is always a.lenght-1
		{
			a[i]=a[i-1];
		}
		a[0]=0;
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}

}
