package Test5;

public class couScoreResult {
	private String courseName;
	private double score;

	public couScoreResult() {
		super();
	}

	public couScoreResult(String courseName, double score) {
		super();
		this.courseName = courseName;
		this.score = score;
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

	@Override
	public String toString() {
		return courseName + "\t" + score + "\t";
	}

}
