import java.util.Scanner;

public class Largest {
	public static void large() {
		int num1, num2, num3, largest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1");
		num1 = scan.nextInt();
		System.out.println("Enter Number2");
		num2 = scan.nextInt();
		System.out.println("Enter Number3");
		num3 = scan.nextInt();
		largest = ((num1 > num2) ? ((num1>num3) ? num1 : num3) :  ((num2 > num3) ? num2 : num3));
		System.out.println("Largest= " + largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest.large();

	}

}
