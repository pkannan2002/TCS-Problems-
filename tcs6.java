import java.util.*;
class trail
{
	public static void main(String args [])
	{
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		int fac=1;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			fac=fac*i;
		}
		while(fac %10==0)
		{
			count++;
			fac/=10;
		}
		System.out.println("the sum of trailing zeros are: "+count);
	}
}

		
		
						