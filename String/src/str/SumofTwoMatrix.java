package str;
import java.util.Scanner;
public class SumofTwoMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row,coloumn,i,j;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of Rows and Coloumns of both Matrices=");
		System.out.print("Enter Rows=");
		row=scan.nextInt();
		System.out.print("Enter Coloumns=");
		coloumn=scan.nextInt();
		int matrix1[][]=new int[row][coloumn];
		int matrix2[][]=new int[row][coloumn];
		int sum[][]=new int[row][coloumn];
		System.out.println("Enter first Matrix Elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<coloumn;j++)
			{
				System.out.println("Matrix1"+"["+i+j+"]"+"=");
				matrix1[i][j]=scan.nextInt();
			}
			
		}
		System.out.println();
		
		System.out.println("Enter Second Matrix Elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<coloumn;j++)
			{

				System.out.println("Matrix2"+"["+i+j+"]"+"=");
				matrix2[i][j]=scan.nextInt();
			}
			
		}
		System.out.println();
		
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<coloumn;j++)
			{
				sum[i] [j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		
		System.out.println("Addition of both the Matrices");
		for(i=0;i<row;i++)
		{
			System.out.println();
			for(j=0;j<coloumn;j++)
			{
				System.out.print(sum[i] [j]);
			}
		}
	}

}
