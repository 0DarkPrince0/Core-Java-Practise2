import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char ch = '*';
		int j, i, n;
		Scanner scan = new Scanner(System.in);
		System.out.print("size of Triangle=");
		n = scan.nextInt();
		System.out.println();

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}

	}

}
