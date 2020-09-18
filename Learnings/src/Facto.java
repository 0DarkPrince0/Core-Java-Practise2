import java.util.Scanner;
public class Facto {

	public int fact(int num)
	{
		if((num==1) || (num==0))
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
	
	public static void main(String[] args) {
		int number,factorial;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number= ");
		number=scan.nextInt();
		Facto f=new Facto();
		factorial=f.fact(number);
		System.out.println(factorial);
	}

}
