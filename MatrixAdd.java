import java.io.*;

class MatrixAdd
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int a[][];
		try
		{
			System.out.println("Enter the row size of the array: ");
			int r=Integer.parseInt(in.readLine());
			System.out.println("Enter the column size of the array: ");
			int c=Integer.parseInt(in.readLine());
			a=new int[r][c];
			System.out.println("Enter the elements into the array: ");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=Integer.parseInt(in.readLine());
				}
			}
			System.out.println("Array Elements are:");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+" ");
				}System.out.println();
			}

			System.out.println("Row-wise Sum");
            		for (int i=0;i<r;i++)
		 	{
				int rowSum=0;
                		for (int j=0;j<c;j++)
			 	{
                    			rowSum=rowSum+a[i][j];
					System.out.print(a[i][j]+" ");
                		}
                		System.out.print(rowSum);
				System.out.println();
				
            		}

            		System.out.println("Column-wise Sum:");
			for (int j=0;j<c;j++) 
			{ 
				int columnSum=0;
                		for (int i=0;i<r;i++)
				{
                    			columnSum=columnSum+a[i][j];
					System.out.print(a[i][j]+" ");
                		}
                		System.out.print(columnSum);
				System.out.println();
            		}

			
		catch(Exception e)
		{
			System.out.println("Error: "+e);
		}
	}
}
