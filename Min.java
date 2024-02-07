import java.io.*;

class Min
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the 3 no.s: ");
			int a=Integer.parseInt(in.readLine());
			int b=Integer.parseInt(in.readLine());
			int c=Integer.parseInt(in.readLine());
			int minimum=(a<b ? ((a<c)?a:c) : ((b<c)?b:c));
			System.out.println("Minimum is "+minimum);
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
