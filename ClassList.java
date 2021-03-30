package Two;

public class ClassList {
	private int semester;
	private int year;
	private Subject subj;
	private Student s1;
	private Student s2;
	public ClassList() {
		super();
	}
	public ClassList(int semester, int year, Subject subj, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.subj = subj;
		this.s1 = s1;
		this.s2 = s2;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Subject getSubj() {
		return subj;
	}
	public void setSubj(Subject subj) {
		this.subj = subj;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public Student getS2() {
		return s2;
	}
	public void setS2(Student s2) {
		this.s2 = s2;
	}
	@Override
	public String toString() {
		String info = "";
		info = this.year+"学年"+this.semester+"学期\n";
		info+=subj.toString();
		info+="学号\t"+"姓名\n";
		info+=s1.toString();
		info+=s2.toString();
		return info;
	}
	
}
