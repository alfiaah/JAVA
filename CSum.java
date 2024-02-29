import java.io.*;
class CSum
{
  public static void main(String args[])
  {
	DataInputStream in = new DataInputStream(System.in);
	String s;
	int a,b;
	try
	{
	 System.out.println("Enter the first no");
	 s = in.readLine();
	 a = Integer.parseInt(s);
	 System.out.println("Enter the second no");
	 s = in.readLine();
	 b = Integer.parseInt(s);
	 System.out.println("sum of " + a + " and " + b  +" is " + (a+b));
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}