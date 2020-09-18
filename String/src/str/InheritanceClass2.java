package str;

public class InheritanceClass2 extends InheritanceClass1 
{
	int depth;
	public void set(int height,int weight,int depth)
	{
		this.height=height;
		this.weight=weight;
		this.depth=depth;
		System.out.println(this.height);
	}
	public void volume()
	{
		System.out.println(height);
		
	}
	public String toString()
	{
		return "Height= "+ this.height + "Weight= "+this.weight + "Depth= "+ this.depth;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Height=");
		int h=new java.util.Scanner(System.in).nextInt();
		System.out.println("Enter Weight=");
		int w=new java.util.Scanner(System.in).nextInt();
		System.out.println("Enter Depth=");
		int d=new java.util.Scanner(System.in).nextInt();
		//InheritanceClass2 ic=new InheritanceClass2();
		new InheritanceClass2().set(h,w,d);
		new InheritanceClass2().volume();
	}

}
