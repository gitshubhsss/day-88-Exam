package whleloop.java;
import java.util.*;
public class while_4 {

	public static void main(String[] args)
	{
		//will check either the numbers is palindrom or not
		//means 121=121, 313=313//
		int n,n1,p,sum=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
		p=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}
		if(p==sum)
		{
			System.out.println("number is palindrom");
			
		}
		else
		{
			System.out.println("number is not palindrom");
		}

	}

}
