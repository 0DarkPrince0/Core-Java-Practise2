package String;

public class Practise 
{


	public static void main(String[] args) 
	{
		/*String name="faheem";
		char ch="faheem".charAt(3);
		char c=name.charAt(0);
		System.out.println(ch);
		System.out.println(c);*/
		String word="java";
		char ch=Character.toUpperCase(word.charAt(0));
		word=ch+word.substring(1);
		System.out.println(word);
	}

}
