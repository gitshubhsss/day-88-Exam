package whleloop.java;
import java.util.*;
public class while_2 {

	public static void main(String[] args)
	{
		//we are going to print the number reversaly
		int n,l,sum=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter number which you wants to reverse");
		n=shubham.nextInt();
		while(n>0)
		{
			l=n%10;
			n=n/10;
			sum=(sum*10)+l;
		}
		System.out.println("reverse no: "+sum);

	}

}
