package array;

public class eualityOfArray {

	public static void main(String[] args) {

		int[] a= {5,10,15,20,25,30};
		int[] b= {5,10,15,20,25,30};

		
		String result=checkEualityOfArray(a,b); // create a method and  return string store the vale result 
		System.out.println(result);
		
	}

	private static String checkEualityOfArray(int[] a, int[] b) {
		
		
		// array are the check the null value bcoz variable declare in method otherwise variable declare class then use the 0 value
		if(a==null && b==null)      //string are return their for use the all if condition other wise use the if else and sysout statement
		 return " both are same,null";
	 if(a==null && a!=null)
		 return "not same";
	 if(a!=null && b==null)
		 return "not same";
	 if(a.length!=b.length)
		 return "not same for length";
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]!=b[i]) // check the one by one value both array
			 return "not same";
	 }
	 return "same";
	 
	}

}


