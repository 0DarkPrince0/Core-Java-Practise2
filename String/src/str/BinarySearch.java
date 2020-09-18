package str;
import java.util.Scanner;
public class BinarySearch {

	
	public static void main(String[] args) 
	{
		int number,i,array[],first,last,middle,search;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many nodes do you want to enter for Binary Search");
		number=scan.nextInt();
		array=new int[number];
		System.out.println("Enter the "+number+" Nodes now");
		for(i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		first=0;
		last=number-1;
		middle=(first+last)/2;
		System.out.println("what number do you want to search.. Enter here");
		search=scan.nextInt();
		while(first<=last)
		{
			if(array[middle]<search)
			{
				first=middle+1;
			}
			else if(array[middle]>search)
			{
				last=middle-1;
			}
			else if(array[middle]==search)
			{
				System.out.println("Number is found at "+(middle+1)+" location");
				break;
			}
			

			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println("Number not found");
			
		
		
		
	}

}
