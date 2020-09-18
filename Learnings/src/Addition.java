import java.util.Scanner;

public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a = scan.nextInt();
		System.out.println("Enter 2nd Number");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("Addtion of both the numbers is " + c);
	}

}
