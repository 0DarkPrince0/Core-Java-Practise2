public class Experiment extends Temo {
	int id;
	String name;

	public void setvalue(int id, String name) {
		super.id = id;
		super.name = name;
	}

	public void display() {
		System.out.println("Id= " + id);
		System.out.println("Name= " + name);
	}

	public static void main(String[] args) {
		Experiment e = new Experiment();
		e.setvalue(1, "Faheem");
		e.display();
		Temo t = new Temo();
		t.display();

	}

}

class Temo {
	int id;
	String name;

	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}