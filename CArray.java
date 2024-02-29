import java.io.*;
class CArray
{
  public static void main(String args[])
  {
	DataInputStream in = new DataInputStream(System.in);
	int a[],n,i;
	try
	{
	 System.out.println("Enter the limit");
	 n = Integer.parseInt(in.readLine());
	 a = new int[n];
	 for(i = 0;i < n;i++)
	 {
 		System.out.println("Enter a[" + i + "]");
		a[i] = Integer.parseInt(in.readLine());
	  }
	  for(i=n-1;i >= 0;i--)
	  {
		System.out.print(a[i] + "  " );
	  }
	}
	catch(Exception e)
	{
	 System.out.println("Error : " + e);
	}
  }
}