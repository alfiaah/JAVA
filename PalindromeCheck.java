import java.io.*;

class Check
{
	int rem,rev=0,n;
	public int reverse(int num)
	{
		n=num;
		while(n>=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public int isPalindrome(int num)
	{
		int rev=reverse(num);
		if(num==rev)
			return 1;
		else
			return 0;
	}	
}

class PalindromeCheck
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int num;
		try
		{
			System.out.println("Enter the number: ");
			num=Integer.parseInt(in.readLine());
			
			Check c=new Check();
			int result=c.isPalindrome(num);

			if(result==1)
				System.out.println(num+" is palindrome");
			else
				System.out.println(num+" is not a palindrome");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			