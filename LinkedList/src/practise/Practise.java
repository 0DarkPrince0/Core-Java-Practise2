package practise;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

class Que
{
	private String que;
	private LinkedList<Option> op;
	public Que() {

		op = new LinkedList<Option>();
	}
	public void setQue(String que)
	{
		this.que=que;
	}
	public String getQue()
	{
		return this.que;
	}
	public void setOp(LinkedList<Option> op)
	{
		this.op=op;
	}
	public LinkedList<Option> getOp()
	{
		return op;
	}
	@Override
	public String toString()
	{
		return que+" "+op;
	}
	
}

class Option
{
	private String option;
	
	public void setOption(String option)
	{
		this.option=option;
	}
	public String getOption()
	{
		return option;
	}
	@Override
	public String toString()
	{
		return option+"\n";
	}
}

 
















public class Practise
{
	private static Scanner scan;
	static
	{
		scan=new Scanner(System.in);
		l=new LinkedList<Que>();
	}
	public static LinkedList<Que> l;
	
	public static void main(String[] args)
	{
		Practise p=new Practise();
		
		while(true)
		{
			System.out.println("Enter you choice");
			System.out.println("1. add");
			System.out.println("2. print");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				p.add();
				break;
				
			case 2:
				p.print();
				break;///
				
			}
		}
		
	}
	public void add()
	{
		scan.nextLine();
		Que q=new Que();
		
		System.out.println("Enter question:");
		String que=scan.nextLine();
		q.setQue(que);
		int i=1;
		while(true)
		{
			Option o=new Option();
			System.out.println("Enter Options "+i +" : " );
			String option=scan.nextLine();
			o.setOption(option);
			q.getOp().add(o);
			i++;
			System.out.print("Do you want to add more Option : ");
			char ch = scan.nextLine().charAt(0);
			if(!(ch=='y' || ch=='Y'))
			{
				break;
			}
		}
		l.add(q);
	}
	public void print()
	{
		Iterator<Que> itr=l.iterator();
		int i =1;
		while(itr.hasNext())
		{
			
			Que que=(Que) itr.next();
			
			System.out.println("\n\nQue "+i+" : "+que.getQue());
			Iterator<Option> itr_op = que.getOp().iterator();
			int op_cnt = 1;
			System.out.print("Options are : ");
			while(itr_op.hasNext())
			{
				Option op = itr_op.next();
				System.out.print(op_cnt+") "+op.getOption()+"\t1");
				op_cnt++;
			}
			i++;
		}
	}

}
