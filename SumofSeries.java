import java.io.*;

class SumofSeries
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int i=0,sum=0,currentsum=0;
		try
		{
			System.out.println("Enter the Limit: ");
			int n=Integer.parseInt(in.readLine());
			while(i<=n)
			{
				currentsum=currentsum+i;	
				sum=sum+currentsum;
				i++;
			}
			System.out.println("Sum : "+sum);
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
	}
}
			