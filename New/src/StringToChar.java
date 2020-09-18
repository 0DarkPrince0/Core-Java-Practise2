
public class StringToChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="Hello";
		String p="";
		char cc[]={'a','b','c'};
		char c[]=s.toCharArray();
		for(char ch:c)
		{
			System.out.println(ch);
		}
		for(int i=0;i<c.length;i++)
		{
			
			System.out.println(c[i]);
		}
		for(int i=0;i<cc.length;i++)
		{
			char z=cc[i];
			p=p+z;
		}
		System.out.println(p);
		
	}

}
