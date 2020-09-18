package WORK;
import java.util.Scanner;
public class Pizzahut {

	public static void main(String[] args) 
	{

		int piece,price=80;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many piece do you want");
		piece=scan.nextInt();
		Pizza p=new Pizza();
		p.pizza(piece, price);
		
		
	}

}
