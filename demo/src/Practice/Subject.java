package Practice;

public class Subject
{
	private int english;
	private int hindi;
	private int urdu;
	private int math;
	private int science;
	
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getUrdu() {
		return urdu;
	}
	public void setUrdu(int urdu) {
		this.urdu = urdu;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "English: " + this.english + ", Hindi: "+ this.hindi + ", Urdu: "+ this.urdu +", Math: "+ this.math +", Science: " + this.science;
	}
}
