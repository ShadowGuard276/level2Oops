package inheritance;

public class Student extends Person {
	private String Collegename;
	private int year;
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
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
