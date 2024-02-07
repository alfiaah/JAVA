import java.io.*;

class Sort
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
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Sorted Array");
			for(int i=0;i<n;i++)
			{
				
				System.out.println(a[i]);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
