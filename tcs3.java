import java.util.*;
class odd
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int digit=d.nextInt();
		int value=0,sum=0;
		while(digit !=0)
		{
			value=digit%10;
			if(value%2 !=0)
			{
				sum+=value;
			}
			digit/=10;
		}
		System.out.println("the dicount amount for the customer is :"+ sum);
	}
}