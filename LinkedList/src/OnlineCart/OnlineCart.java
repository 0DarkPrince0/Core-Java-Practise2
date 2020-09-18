package OnlineCart;

import java.util.Scanner;
class OnlineCart 
{
	private LinkedList<Product> cart;
	private int cnt;
	private static Scanner scan;
	static
	{
		scan = new Scanner(System.in);
	}
	OnlineCart()
	{
		cart = new LinkedList<Product>();
		cnt=1;
	}
	public void addToCart()
	{
		System.out.println("\n\n************************************************************");
		scan.nextLine();
		Product product = new Product();
		product.setId(cnt++);
		System.out.print("Enter Product Name   : ");
		product.setName(scan.nextLine());
		System.out.print("Enter Product Desc   : ");
		product.setDesc(scan.nextLine());
		System.out.print("Enter Product Brand  : ");
		product.setBrand(scan.nextLine());
		System.out.print("Enter Product Price  : ");
		product.setPrice(scan.nextDouble());
		cart.add(product);
		System.out.println("************************************************************");
		System.out.println("Product Added..");
		System.out.println("************************************************************\n\n");
	}
	public void removeFromCart()
	{
		System.out.println("\n\n************************************************************");
		scan.nextLine();
		System.out.print("Enter Product Name to be Removed : ");
		String productName = scan.nextLine();
		Iterator itr = cart.iterator();
		int i,flag;
		i=1;
		flag=0;
		while(itr.hasNext())
		{
			Product product = (Product)itr.next();
			if(product.getName().equalsIgnoreCase(productName))
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1)
		{
			cart.remove(i);
			System.out.println("Product removed...");
		}
		else
		{
			System.out.println("Product Not Found...");
		}
		System.out.println("************************************************************\n\n");
	}
	public void displayCart()
	{
		System.out.println("\n\n************************************************************");
		System.out.println("              All Product into your Cart");
		System.out.println("************************************************************");
		Iterator itr = cart.iterator();
		while(itr.hasNext())
		{
			Product product = (Product)itr.next();
			System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getDesc()+"\t"+product.getBrand()+"\t"+product.getPrice());
		}
		System.out.println("************************************************************\n\n");
	}
	public void updateCart()
	{
	}
	public void searchCart()
	{
	}
	public static void main(String...s_)
	{
		OnlineCart oc = new OnlineCart();
		while(true)
		{
			System.out.println("1. Add to cart");
			System.out.println("2. Search cart(Search Product)");
			System.out.println("3. Modify cart(Update Product)");
			System.out.println("4. Remove from cart");
			System.out.println("5. Display Cart");
			System.out.println("0. Exit");
			System.out.print("Enter Choice : ");
			switch(scan.nextInt())
			{
				case 1:
					oc.addToCart();
					break;
				case 2:
					oc.searchCart();
					break;
				case 3:
					oc.updateCart();
					break;
				case 4:
					oc.removeFromCart();
					break;
				case 5:
					oc.displayCart();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice ");
			}			
		}
	}
}
