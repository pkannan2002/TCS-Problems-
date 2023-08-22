import java.util.*;
class rev
{
	public static void main(String args [])
	{
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		int rever=0;
		while(data!=0)
		{
			rever=(rever*10)+(data%10);
			data/=10;
		}
		System.out.print(rever);
	}
}