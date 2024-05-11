package whleloop.java;
import java.util.*;
public class while_1 {

	public static void main(String[] args)
	{
		//we are going to find the sum of the number
		int n,l,sum=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the number");
		n=shubham.nextInt();
		while(n>0)
		{
			l=n%10;//shifting of numbers
			n=n/10;//separate the digits from each other 
			sum=sum+l;
		}
		System.out.println("sum="+sum);
		
	}

}
