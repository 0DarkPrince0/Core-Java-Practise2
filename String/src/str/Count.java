package str;
import java.util.Scanner;
public class Count {

	
	public static void main(String[] args) {
		char ch[];
		String s;
		int i=0, letter=0, digit=0,special=0,whitespace=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the line");
		s=scan.nextLine();
		ch=s.toCharArray();
		for( i=0;i<s.length();i++)
		{
			char c = ch[i];
			//ch = s.charAt(i);
	
			if(Character.isDigit(c))
			{
				digit++;
			}
			else if(Character.isWhitespace(c))
			{
				whitespace++;
			}
			else if(Character.isLetter(c))
			{
				letter++;
			}
			
		}

		System.out.println("Digits "+digit);
		System.out.println("Whitlespace "+whitespace);
		System.out.println("Letters "+letter);
		System.out.println("Special Character "+special);
	
	}


}
