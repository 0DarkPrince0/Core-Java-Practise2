import java.util.Scanner;


public class one {

	public static void main(String[] args) {
		
		int number,i;
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of number");
		number=scan.nextInt();
		int array[]=new int[number];	
		for(i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		
		for(i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		for(i=0;i<array.length;i++)
		{
		if((array[i]==0) ||(array[i]==1))
		{
			flag=true;
		}
		else
		{
			flag=false;
			break;
		}
		}
		System.out.println();
		if(flag==true)
		{
			System.out.println("Number is Binary");
		}
		else
		{
			System.out.println("Number is not in Binary form");
		}
	}

}
