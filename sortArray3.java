package array;

public class sortArray3 {

	public static void main(String[] args) {
int [] a= {12,34,66,78,99,767,66};
int num=99;

int start=0;
int end=a.length-1;

while(start<=end)
{
int mid=(start+end)/2;
 if(a[mid]==num) {
	 System.out.println("found"+mid);
  break;
 }
 else if(num>a[mid])
	 start=mid+1;
 else
	 end=mid-1;
}

if(start>end)
	System.out.println("not found");
	}

}
