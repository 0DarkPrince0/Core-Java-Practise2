package onlineCart1;

public class Product 
{
	private int id;
	private String name;
	private String brand;
	private int price;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
		
	}
	public int getPrince()
	{
		return price;
	}
	@Override
	public String toString()
	{
		return "Id: "+id+" Name: "+name+" Brand: "+brand+" Price: "+price ;
	}
}
