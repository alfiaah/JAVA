import java.io.*;

class CRead
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		
		try	
		{
			System.out.println("Enter your name: ");
			String name=in.readLine();
			System.out.println("Enter your age: ");
			int age=Integer.parseInt(in.readLine());
			System.out.println("Name: "+name+"\nAge: "+age);
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}

