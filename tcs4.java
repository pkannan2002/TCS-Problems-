import java.util.*;
class miss
{
	public static void main(String args [])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if((Character.isDigit(str.charAt(i))) || (Character.isLetter(str.charAt(i))) || (str.charAt(i) == ' '))
			{
				continue;
			}
			else 
			{
				count++;
			}
		}
		System.out.println("the sum of character that are considered as miss: "+ count);
	}
}
				