import java.util.Scanner;


public class LargestSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int number=scan.nextInt();
		int array[]=new int[number];
		
		for(int i=0; i<array.length;i++)
		{
			System.out.println("Enter number "+(i+1));
			array[i]=scan.nextInt();
		}
		System.out.println("You just Entered");
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		int largest=array[0];
		int smallest=array[0];
		for(int i=0; i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];
			}
			else if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		System.out.println("Largest= "+largest);
		System.out.println("Smallest= "+smallest);
	}
}
