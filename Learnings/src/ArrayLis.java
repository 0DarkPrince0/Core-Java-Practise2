import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ArrayLis {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new  ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("How many number of things do you want to Enter");
		int number=scan.nextInt();
		System.out.println("So You have to enter "+number+" things");
		for(int i=0;i<number;i++)
		{
			al.add(scan.nextInt());
		}
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(al);
	
		

	}

}
