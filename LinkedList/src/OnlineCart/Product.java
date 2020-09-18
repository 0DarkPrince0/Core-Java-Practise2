package OnlineCart;

class Product
{
	private int id;
	private String name;
	private String desc;
	private String brand;
	private double price;
	
	//getter and setter
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	//getter and setter
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	//getter and setter
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDesc()
	{
		return desc;
	}
	//getter and setter
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	//getter and setter
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	@Override
	public String toString()
	{
		return id+"\t"+name+"\t"+desc+"\t"+brand+"\t"+price;
	}	
}
