public class Students {

	public static void main(String[] args) {
		Record r1 = new Record();
		Record r2 = new Record();
		r1.setvalue(1, "faheem");

		r2.setvalue(2, "Ilahi");
	}

}

class Record {
	public void setvalue(int roll, String name) {
		String college = "PSIT";
		System.out.println(roll + " " + name + " " + college);

	}
}
