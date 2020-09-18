import java.util.Scanner;
public class Searching {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("how many numbers do you want to enter");
		int limit=scan.nextInt();
		int array[]=new int[limit+1];
		for(int i=0;i<limit;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		for(int i=0;i<limit;i++)
		{
			if(number==array[i])
			{
				flag=true;
			}
			
		}
		if(flag==true)
		{
		System.out.println("This number is already in array");
		}
		else
		{
			System.out.println("Number is not in array");
		}
		
		//array[limit+1]=number;
		/*for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}*/
		
	}
	

}
