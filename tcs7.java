import java.util.*;
class chemist
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int initial=s.nextInt();
		int rate=s.nextInt();
		int time=s.nextInt();
		for(int i=1;i<time;i++)
		{
			initial*=rate;
		}
		System.out.println("the sum the energy produced in the give time :"+ initial);
	}
}
