package Practice;

public class Student 
{
private String name;
private Subject subject;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}
public String toString() {
	// TODO Auto-generated method stub
	return "Name: " + this.name + "\n" + "Subjects: " + subject;
}
}
