package array;

import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {

      int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 5 element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}                                     // array are the given no are user ip and the store the array and sym of array using for loop
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
			System.out.println(sum);
		
		
			
	}

}
