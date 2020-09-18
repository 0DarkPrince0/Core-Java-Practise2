
public class Storage<T> 
{

	T data;
	public static void main(String...sl)
	{

		Storage<Integer> s = new Storage<Integer>();
		s.data = 100;
		System.out.println(s.data);


		Storage<Integer> s1 = new Storage<Integer>();
		s1.data = 1000;		//Integer.valueOf(100);
		System.out.println(s1.data);
		
		Storage<Float> s2 = new Storage<Float>();
		s2.data = 200.22f;	//Float.valueOf(200.22f);
		System.out.println(s2.data);
		Storage<String> s3=new Storage<String>();
		s3.data="faheem";
		System.out.println(s3.data);
	
	}

}
