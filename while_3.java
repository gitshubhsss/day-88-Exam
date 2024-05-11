package whleloop.java;
import java.util.*;
public class while_3 {

	public static void main(String[] args)
	{
		//will check either the given number is armstrong or not
		int n,n1,l,sum=0;//here l we are using to store the value of n
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
		l=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=sum+(n1*n1*n1);
		}
		if(l==sum)
		{
			System.out.println("given number is armstrong");
		}
		else
		{
			System.out.println("given number is not armstrong");
		}

	}

}
