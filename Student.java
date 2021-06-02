package week14.vo;

public class Student {
	private String id;
	private String name;
	private String birth;
	private String gender;
	private double score;

	public Student() {
		super();
	}

	public Student(String id, String name, String birth, String gender, double score) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", score=" + score
				+ "]";
	}

}
