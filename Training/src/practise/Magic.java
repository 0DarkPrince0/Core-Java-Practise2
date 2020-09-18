package practise;

public class Magic {

	public static void main(String[] args) {
		int L = 6;
		int R = 10;
		int i;
		int count = 0;

		for (i = L; i <= R; i++) {
			if (i % 2 == 0) {
				if (bit(i)) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);

	}

	public static boolean bit(int a) {
		int count = 0;
		int remainder = 0;
		while (a != 0) {
			remainder = a % 2;
			a = a / 2;
			if (remainder == 1) {
				count = count + 1;
			}
		}

		if (isPrime(count)) {
			return true;
		}

		return false;
	}

	public static boolean isPrime(int number) {

		boolean prime;
		int temp = 0;

		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				prime = false;
				break;
			}
		}
		return prime = true;

	}

}
