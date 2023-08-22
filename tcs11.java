import java.util.*;
import java.io.*;
class enco
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		String str =s.nextLine();
		char find=s.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==find)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
		