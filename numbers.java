import java.io.*;

class numbers
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the starting number: ");
			int m=Integer.parseInt(in.readLine());
			System.out.println("Enter the ending number: ");
			int n=Integer.parseInt(in.readLine());
			System.out.println("Numbers are: ");
			while(m<=n)
			{
				System.out.println(m+" ");
				m++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
	}
}
			