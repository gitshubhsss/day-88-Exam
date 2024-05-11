package whleloop.java;
import java.util.*;
public class while_14 {

	public static void main(String[] args) 
	{
		int n1,n,cntp=0;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			if(n1==2 || n1==3 || n1==5 || n1==7)
				cntp++;
		}
		System.out.println("number of prime digits="+cntp);

	}

}
