package workingWithObject;

abstract class Bird
{
	abstract void fly();
	abstract void speak();
}
class Sparrow extends Bird
{
	@Override
	void fly()
	{
		System.out.println("Mid fly");
	}
	@Override
	void speak()
	{
		System.out.println("Chee cheee cheee");
	}
}
class Crow extends Bird
{
	@Override
	void fly()
	{
		System.out.println("mid high fly");
	}
	@Override
	void speak()
	{
		System.out.println("Cow cow cow");
	}
}
class Eagle extends Bird
{
	@Override
	void fly()
	{
		System.out.println("high fly");
	}
	@Override
	void speak()
	{
		System.out.println("keeee keeee");
	}
}
