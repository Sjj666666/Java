package Two;

public class Student {
	private String studentID;
	private String name;
	public Student(String studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	public Student() {
		super();
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.studentID+"\t"+this.name+"\n";
	}
}
