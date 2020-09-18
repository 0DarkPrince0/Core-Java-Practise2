
public class Addition <T>
{
	T data1;
	T data2;
	public void setdata(T data1,T data2)
	{
		this.data1=data1;
		this.data2=data2;
	}
	
	
	public static void main(String[] args) 
	{
		Addition <Integer> s=new Addition<Integer>();
		//Addition <String> s1=new Addition<String>();
		
		s.setdata(1, 2);
		System.out.println(s.data1);
		System.out.println(s.data2);
		System.out.println(s.data1+s.data2);
		
		Addition <String>s1=new Addition<String>();
		s1.setdata("Faheem", " Ilahi");
		System.out.println(s1.data1+s1.data2);

	}

}
