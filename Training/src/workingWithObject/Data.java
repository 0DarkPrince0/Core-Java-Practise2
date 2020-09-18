package workingWithObject;

public class Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Subjects sub=new Subjects();
		sub.setHindi(45);
		sub.setEnglish(40);
		sub.setmath(49);
		
		Student stu=new Student();
		stu.setName("Faheem");
		stu.setSujects(sub);
		
		
		Subjects sub1=new Subjects();
		sub1.setHindi(29);
		sub1.setEnglish(35);
		sub1.setmath(40);
		Student stu1=new Student();
		stu1.setName("Sonali");
		stu1.setSujects(sub1);
		
		
		System.out.println(stu);
		System.out.println(stu1);
	}

}
