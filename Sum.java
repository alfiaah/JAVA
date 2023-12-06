import java.io.*;

class Sum
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the 1st num: ");
			int n1=Integer.parseInt(in.readLine());
			System.out.println("Enter the 2nd num: ");
			int n2=Integer.parseInt(in.readLine());
			System.out.println("Sum = "+(n1+n2));
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}