import java.util.ArrayList;
import java.util.Scanner;


public class Daemon {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Please enter the size of ArrayList: " );
		Scanner scan=new Scanner(System.in);
		int size = scan.nextInt();
		for(int i=0 ; i<size ; i++){
			arrayList.add(i+1);
		}
		System.out.println(arrayList);
	}
}
