package array;

public class studentNewClass {

	public static void main(String[] args) {

		Student s1=new Student(1,"somu",40);
		Student s2=new Student(2,"gomu",41);
		Student s3=new Student(3,"somya",39);
		Student s4=new Student(4,"gomya",38);
		
		
		Student [] s= {s1,s2,s3,s4}; 
		
		// sorting of array object
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].marks>s[j].marks)  // > Assending order use and < decsending order use
				{
					Student temp=s[i];   // swap the marks
					s[i]=s[j];
					s[j]=temp;
				}
				
			}
		}
		
		
		
		
		
		// print the array s
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i].id+" "+s[i].name+" "+s[i].marks);
		 // s[i] is store the address and assign to the address  
		}

	}

}


 class Student{
	 
	 int id;
	 String name;
	 int marks;
	 
	public Student(int id, String name, int marks) // create constructor
	{
	super();                                   
this.id=id;  
this.name= name;
this.marks=marks;
 }
 }
