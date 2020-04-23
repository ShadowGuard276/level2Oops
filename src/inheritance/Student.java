package inheritance;

public class Student extends Person {
	private String Collegename;
	private int year;
	public Student(String name, String Collegename) {
		super(name);
		System.out.println("Student Constructor");
		this.Collegename= Collegename;
	}
	public String getCollegename() {
		return Collegename;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	/*public String toString(){
		return Collegename+"#"+ year;
		
		
	}*/

}
