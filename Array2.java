package array;

import java.util.Scanner;
// array is a user ip and store the value in array

public class Array2 {

	public static void main(String[] args) {

		int a[]=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 5 element");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array list is "); 
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
