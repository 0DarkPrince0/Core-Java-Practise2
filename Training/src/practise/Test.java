package practise;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int lines;
		System.out.println("Enter lines");
		lines=scan.nextInt();
		char array[][]=new char[lines][];		
		for(int i=0;i<array.length;i++)
		{
			
			array[i]=new char[i+1];
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]='*';
			}
		}
	
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		scan.close();
		
	


		
	}

}
