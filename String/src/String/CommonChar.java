package String;

import java.util.LinkedHashSet;

public class CommonChar {
	public static void main(String[] args)
	{

	String s1 = "fahim";
	String s2 = "ilahi";

	char[] s1Array = s1.toCharArray();
	char[] s2Array = s2.toCharArray();

	LinkedHashSet<Character> s1CharSet = new LinkedHashSet<Character>();
	LinkedHashSet<Character> s2CharSet = new LinkedHashSet<Character>();

	for(char c1 : s1Array){
	    s1CharSet.add(c1);
	}

	for(char c2: s2Array){
	    s2CharSet.add(c2);
	}
	
	s1CharSet.retainAll(s2CharSet);

	if(s1CharSet.size()==0){
	    System.out.println("There are no common characters between the two strings");
	}
	else
	{
	    System.out.println(s1CharSet);
	}
	}
	}
