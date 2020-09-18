
public class EvenOdd {

public static void even()
{
	int num;
	System.out.println("Enter the number");
	num=new java.util.Scanner(System.in).nextInt();
	if((num & 1) ==0)
	{
		System.out.println("Even");
	}
	else
		System.out.println("Odd");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOdd.even();
	}

}
