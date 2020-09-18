import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class SortDesc 
{

	
	public static void main(String[] args) 
	{
	
		int array[]=new int[5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter five numbers");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter Number"+(i+1));
			array[i]=scan.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted array is-");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			
		}
		Integer in[]=new Integer[array.length];
		for(int i=0;i<array.length;i++)
		{
			in[i]=array[i];
			//in[i]=new Integer(array[i]);
		}
		Arrays.sort(in, Collections.reverseOrder());
		for(int i=0;i<array.length;i++)
		{
			System.out.println(in[i]);
			
		}
	}
	
	

}
