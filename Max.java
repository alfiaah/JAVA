import java.io.*;

class Max
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
			if(a>b && a>c)
			{
				System.out.println(a+" is Maximum");
			}
			else if(b>c)
			{
				System.out.println(b+" is Maximum");
			}
			else
			{
				System.out.println(c+" is Maximum");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
