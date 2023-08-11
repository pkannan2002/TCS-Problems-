import java.util.*;
class revenue 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int [n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{	
			int temp=0;	
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]>temp)
				{
					temp=arr[i][j];
				}
			}
			System.out.print("the maximum sales in day "+ (i+1) +":"+ temp);
			System.out.println();
		}
	}
}
			
				
		
