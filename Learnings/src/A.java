
public interface A 
{
	public void add(int a ,int b);
}
interface B extends A
{
	public void sub(int a,int b);
	
}
interface C extends B
{
public void mul(int a,int b);

}
interface D extends C
{
	public void div(int a, int b);
}
