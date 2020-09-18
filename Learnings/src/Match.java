import java.util.Scanner;

public class Match {

	public void match(String n, String m) {
		System.out.println("Matching without ignoring case");
		boolean s = n.equals(m);
		if (s == true) {
			System.out.println("Strings are same");
		} else
			System.out.println("Strings are not same");

	}

	public void match1(String n, String m) {
		System.out.println("Matching with ignoring case");
		boolean s = n.equalsIgnoreCase(m);
		if (s == true) {
			System.out.println("Strings are same");
		} else
			System.out.println("Strings are not same");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = scan.next();
		System.out.println("Enter 2nd String");
		String s2 = scan.next();
		Match m = new Match();
		m.match(s1, s2);
		m.match1(s1, s2);

	}

}
