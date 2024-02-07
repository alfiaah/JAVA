import java.io.*;

class Swap
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int temp;
		try
		{
			System.out.println("Enter the value of a: ");
			int n1=Integer.parseInt(in.readLine());
			System.out.println("Enter the value of b: ");
			int n2=Integer.parseInt(in.readLine());
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("a : "+n1+"\nb : "+n2);
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}