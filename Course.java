package week12;

public class Course {
	private String ID;
	private String courseName;
	private double score;

	public Course() {
		super();
	}

	public Course(String iD, String courseName, double score) {
		super();
		ID = iD;
		this.courseName = courseName;
		this.score = score;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
