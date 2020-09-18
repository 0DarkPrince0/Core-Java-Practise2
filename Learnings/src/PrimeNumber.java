import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scan.nextInt();
		boolean isPrime = true;
		int temp;

		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Number is prime");

		} else {
			System.out.println("Number is not prime");
		}
	}

}
