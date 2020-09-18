import java.util.Scanner;


public class SubjectMarks 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i,total=0,average;
		Scanner scan=new Scanner(System.in);
		int array[]=new int[5];
		System.out.println("Enter Five Subject Marks");
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Subject Number "+(i+1)+" Marks");
			array[i]=scan.nextInt();
		}
		System.out.print("Total of Five Numbers= ");
		for(i=0;i<5;i++)
		{
			total=total+array[i];
		}
		System.out.println(total);
		average=total/5;
		System.out.println("Average of Marks= "+average);
		
		
	}

}
