package whleloop.java;
import java.util.*;
public class while_13 {

	public static void main(String[] args)
	{
		//accept the n numbers from user and dislay its count
		int n,n1,sum=0;
		Scanner shubham=new Scanner (System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=(sum*10)+n1;
		}//the numbers has reverse
		
		
			System.out.println("="+sum);
		
		
		
		
		

	}

}
