import java.io.*;

class SumofFact
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		double sum=0,fact=1;
		try
		{
			System.out.println("Enter the Limit: ");
			int n=Integer.parseInt(in.readLine());
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				sum=sum+(i/fact);
			}
			System.out.println("Sum : "+sum);
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
	}
}
			