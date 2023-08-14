import java.util.*;
class stock
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int size=s.nextInt();
		int place=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("the "+place +"th smallest stock is:"+arr[place-1]);
	}
}

		