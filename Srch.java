import java.io.*;

class Srch
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a[];
		try
		{
			System.out.println("Enter the size of the array: ");
			int n=Integer.parseInt(in.readLine());
			a=new int[n];
			System.out.println("Enter the elements into the array: ");
			for(int i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(in.readLine());
			}
			System.out.println("Enter the element to be searched: ");
			int s=Integer.parseInt(in.readLine());
			for(int i=0;i<n;i++)
			{
				if(a[i]==s)
				{
					System.out.println("Element found at position "+(i+1));
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
