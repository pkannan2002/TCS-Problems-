import java.util.*;
import java.io.*;
class seq
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int input=s.nextInt();
		int sum=0,var1=1,var2=1;
		for(int i=0;i<input-2;i++)
		{
			sum=var1+var2;
			var1=var2;
			var2=sum;
		}
		System.out.println("the lucky winner is: "+ sum);
	}
}
			
		