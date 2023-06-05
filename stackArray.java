package array;

public class stackArray {

	public static void main(String[] args) {

		MySt mySt=new MySt();
		
		mySt.push(10);
		mySt.push(10);
		mySt.pop();
	 mySt.print();
		
		
		
	}

}


 class MySt{

	private  int [] a =new int[5];
private	 int p=0;
	
	
	public void push( int num)
	{
		if(p>=a.length)
		{
			System.out.println("Stack is full");
		}
		else
		{
			a[p]=num;
			p++;
		}
	}
	
	public int pop()
	{
		if(p==0)
		{
			System.out.println("Stack is empty");
			return 0 ;
		}
		else
		{
			p--;
			return a[p];
		}
	}
	
	public void print()
	{
		for(int i=0;i<p;i++)
		{
			System.out.print(a[i]+" ");
			System.out.println();
		}
	}
	
	
}