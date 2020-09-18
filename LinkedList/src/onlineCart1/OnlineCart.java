package onlineCart1;
import java.util.Scanner;
public class OnlineCart 
{
	Scanner scan=new Scanner(System.in);
	LinkedList<Product> cart=new LinkedList<Product>();
	private int id=0;
	public void addToCart()
	{
		scan.nextLine();
	Product product = new Product();
	product.setId(id++);
	System.out.println("Enter Product name:");
	product.setName(scan.nextLine());
	System.out.println("Enter Brand name:");
	product.setBrand(scan.nextLine());
	System.out.println("Enter Price");
	product.setPrice(scan.nextInt());
	cart.add(product);
	System.out.println("Product Added in cart");
	
	}
	
	
	public void removeFromCart()
	{
		
		System.out.println("Enter the name of product you want to remove from cart: ");
		String productName=scan.nextLine();
		int i,flag;
		i=1;flag=0;
		Iterator<Product> itr=cart.iterator();
		while(itr.hasNext())
		{
			Product product=(Product)itr.next();
			if(product.getName().equalsIgnoreCase(productName))
					{
						flag=1;
						break;
					}
			i++;
		}
		if(flag==1)
		{
			cart.delete(i);
			System.out.println("Product has been deleted from Cart:");
		}
		else
		{
			System.out.println("Product is not found");
		}
		
	}public void traverse()
	{
		Iterator<Product> itr=cart.iterator();
		while(itr.hasNext())
		{
			Product product=(Product) itr.next();
			System.out.println(product.getId()+" "+product.getName()+" "+product.getBrand()+" "+product.getPrince());
			
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		OnlineCart oc=new OnlineCart();
		
		while(true)
		{

			System.out.println("Enter Your choice: ");
			System.out.println("1. for Add product: ");
			System.out.println("2. for delete product: ");
			System.out.println("3. for display all products: ");
			System.out.println("0. for exit: ");
			
			switch(scan.nextInt())
			{
				case 1:
				{
					oc.addToCart();
					break;
				}
				
				
				case 2:
				{
					oc.removeFromCart();
					break;
				}
				
				case 3:
				{
					oc.traverse();
					break;
				}
				
				case 0:
				{
					System.exit(0);
				}
				
				default:
				{
					System.out.println("Invalid choice");
				}
			}
			
		}
		
		
	}

}
