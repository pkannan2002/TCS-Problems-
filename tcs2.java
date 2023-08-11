import java.util.*;
class encry
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		String send=s.next();
		String receive=s.next();
		char temp=0;
		for(int i=0;i<send.length();i++)
		{
			for(int j=0;j<receive.length();j++)
			{
				if(send.charAt(i)!=receive.charAt(j))
				{
					temp=send.charAt(i);
					break;
				}
			}
		}
		System.out.println(temp);
	}
}

					
		