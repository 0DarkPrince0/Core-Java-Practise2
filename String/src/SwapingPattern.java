import java.util.Scanner;
public class SwapingPattern
{

	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		String array[]=new String[6];
		int i;
		String temp;
		System.out.println("Enter the Series");
		
		for(i=0;i<array.length;i++)
		{
			array[i]=scan.next();
			
		}
		System.out.println("You Enter:- ");
		

	
		for(i=0;i<array.length;)
		{
			temp=array[i];
			array[i]=array[i+1];
			array[i+1]=temp;
			i=i+2;
			
		}

		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
