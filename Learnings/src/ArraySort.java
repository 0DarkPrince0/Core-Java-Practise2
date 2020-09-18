import java.util.Arrays	;
import java.util.Scanner;

public class ArraySort {

	int array[] = new int[3];
	static int i = 0;

	public void setter(int a) {
		this.array[i] = a;
		i++;
	}

	public static void main(String[] args) {
		ArraySort as = new ArraySort();
		Scanner scan = new Scanner(System.in);
		System.out.print("How many Numbers do you want to Insert= ");
		int number = scan.nextInt();
		System.out.println();
		System.out.println("Enter Numbers:-\n");
		for (int i = 0; i < number; i++) {
			System.out.print("Enter Number" + (i + 1) + ":- ");
			int element = scan.nextInt();
			as.setter(element);
			System.out.println();

		}
		System.out.println("Array Elements are=");
		for (int i = 0; i < number; i++) {
			System.out.print("Number" + (i + 1) + ":- " + as.array[i]);
			System.out.print(" ");
		}
		System.out.println("\nAfter sorting Array Elements:-");
		Arrays.sort(as.array);
		for (int i = 0; i < number; i++) {
			System.out.print("Number" + (i + 1) + ":- " + as.array[i]);
			System.out.print(" ");
		}
	}

}
