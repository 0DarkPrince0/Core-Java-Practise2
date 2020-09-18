package String;
//import java.util.Scanner;
public class Char2String {

	
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		char array[]={'a','b','c'};
		String str;
		String str1;
		String str2;
		str=new String(array);
		str1=String.valueOf(array);
		str2=String.copyValueOf(array);
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.gc();
		
		
	}

}
