package practise;
import java.util.Scanner;
public class PatternWithUnderScor 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter lines");
		int lines=scan.nextInt();
		String array[][]=new String[lines][];
		int i,j;
		
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				array[i][j]="*";
			}
		}
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
	}

}
