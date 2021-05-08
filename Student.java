package Test5;

public class Student {
	private String ID;
	private String name;
	private String gender;

	public Student() {
		super();
	}

	public Student(String iD, String name, String gender) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
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

	@Override
	public String toString() {
		return ID + "\t" + name + "\t" + gender;
	}

}
