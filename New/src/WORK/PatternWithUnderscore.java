package WORK;

import java.util.Scanner;

public class PatternWithUnderscore 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int lines;
		int i,j,k;
		System.out.print("How many lines do you want to print:-");
		lines=scan.nextInt();
		
		for(i=1;i<=lines;i++)
		{
			for(j=lines;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
