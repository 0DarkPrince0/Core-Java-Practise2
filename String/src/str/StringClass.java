package str;

public class StringClass {

	
	public static void main(String[] args) {
		
		String s1=new String("faheem");
		String s2="Ilahi";
		//String s3="Ilahi";
		//String s4=new String ("faheem");
		String s5="faheem";
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 3));*/
		char d[]={'f','a','h','e','e','m'};
		String s=new String(d);
		
		System.out.println(s);
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]);
		}
		System.out.println();		
		System.out.println(s1.charAt(2));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.concat(s2));
		
		if(s1 ==(s5))
		{
		System.out.println("Same ");

		}
		else
		{
			System.out.println("Different ");
		}
		
	}

}
