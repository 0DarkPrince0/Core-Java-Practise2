package LinkedList;


public class ListIMP 
{

	
	public static void main(String[] args) 
	{
		Node node1=new Node();
		node1.setData(10);
		Node node2=new Node();
		node2.setData(20);
		Node node3=new Node();
		node3.setData(30);
		Node node4=new Node();
		node4.setData(40);
		Node node5=new Node();
		node5.setData(50);
		
		LinkedList l=new LinkedList();
		l.addNode(node1);
		l.addNode(node2);
		l.addNode(node3);
		l.addNode(node4);
		l.addNode(node5);
		System.out.println("Print all Nodes");
		l.traverse();
		//l.deleteAtEnd();
	//	System.out.println("Node deleted from last");
	//	l.traverse();
	//	l.deleteAtStart();
	//	System.out.println("Node deleted from at start");
	//	l.traverse();
	//	System.out.println("Deleting at postion 2");
	//	l.deletedByUser(2);
	//	l.traverse();
		
		
	}

}
