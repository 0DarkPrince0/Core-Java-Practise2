package String;

import java.util.Scanner;

public class email {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char amparsand='@';
		String email;
		int result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your mail Id");
		email=scan.next();
		result=email.indexOf(amparsand);
		if(result==-1)
		{
			System.out.println("Email is invalid");
		}
		else
		{
			System.out.println("valid email");
		}
		System.exit(0);
	}

}
