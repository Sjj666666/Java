package week12;

public class Student {
	private String ID;
	private String name;
	private String gender;
	private double avgStudent;

	public Student() {
		super();
	}

	public Student(String iD, String name, String gender) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
	}

	public Student(String iD, String name, String gender, double avgStudent) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
		this.avgStudent = avgStudent;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAvgStudent() {
		return avgStudent;
	}

	public void setAvgStudent(double avgStudent) {
		this.avgStudent = avgStudent;
	}

	@Override
	public String toString() {
		return ID + "\t" + name + "\t" + gender + "\t" + avgStudent;
	}

}
