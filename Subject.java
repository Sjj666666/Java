package Two;

public class Subject {
	private String subjectID;
	private String subjectName;
	public Subject() {
		super();
	}
	public Subject(String subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		String info = "";
		info = "�γ̴���:"+this.subjectID+"\t�γ�����:"+this.subjectName+"\n";
		return info;
	}
	
}
