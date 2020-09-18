package workingWithObject;

public class BirdIMP 
{
	void callBird(Bird bird)
	{
		bird.fly();
		bird.speak();
	}
	
	public static void main(String[] args) 
	{
		BirdIMP bi = new BirdIMP();
		bi.callBird(new Eagle());
	}

}