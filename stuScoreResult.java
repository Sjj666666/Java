package Test5;

public class stuScoreResult extends Student {
	private double aveScore;

	public stuScoreResult() {
		super();
	}

	public stuScoreResult(String iD, String name, String gender, double aveScore) {
		super(iD, name, gender);
		this.aveScore = aveScore;
	}

	public double getAveScore() {
		return aveScore;
	}

	public void setAveScore(double aveScore) {
		this.aveScore = aveScore;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\t" + aveScore;
		return info;
	}

}
