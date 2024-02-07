import java.io.*;

public class product
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the 1st number: ");
			int a=Integer.parseInt(in.readLine());
			System.out.println("Enter the 2nd number: ");
			int b=Integer.parseInt(in.readLine());
			System.out.println("Product = "+(a*b));
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}