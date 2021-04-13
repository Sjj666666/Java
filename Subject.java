package week7;

public class Subject {
	private String subjID;
	private String subjName;
	private int maxNum;

	public Subject() {
		super();
	}

	public Subject(String subjID, String subjName, int maxNum) {
		super();
		this.subjID = subjID;
		this.subjName = subjName;
		this.maxNum = maxNum;
	}

	public String getSubjID() {
		return subjID;
	}

	public void setSubjID(String subjID) {
		this.subjID = subjID;
	}

	public String getSubjName() {
		return subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	public int getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	@Override
	public String toString() {
		return "课程ID:" + subjID + "\t课程名:" + subjName + "\t最大人数:" + maxNum;
	}

}