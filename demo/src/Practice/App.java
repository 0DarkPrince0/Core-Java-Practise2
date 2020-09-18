package Practice;
import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Number of Students do you want to Enter=");
		int number=scan.nextInt();
		Student array[]=new Student[number];
		Subject array1[]=new Subject[number];
		for(int i=0;i<array.length;i++)
		{
			array[i]= new Student();
			System.out.println("Enter Student name");
			array[i].setName(scan.next());
			array1[i]=new Subject();
			
			
			System.out.println("Enter Five subject Marks");
			System.out.println("Enter English Marks");
			array1[i].setEnglish(scan.nextInt());
			
			System.out.println("Enter Hindi Marks");
			array1[i].setHindi(scan.nextInt());
			
			System.out.println("Enter Urdu Marks");
			array1[i].setUrdu(scan.nextInt());
			System.out.println("Enter Math Marks");
			array1[i].setMath(scan.nextInt());
			System.out.println("Enter Science Marks");
			array1[i].setScience(scan.nextInt());
			
			array[i].setSubject(array1[i]);

			
		}
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);
		}
	}

}
