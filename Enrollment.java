package week7;

public class Enrollment {
	private Student[] list;
	private Subject subj;
	private int count;

	public Enrollment(Subject subj) {
		count = 0;
		this.subj = subj;
		list = new Student[subj.getMaxNum()];
	}

	public boolean add(Student student) {
		if (count >= list.length) {
			return false;
		}
		if (student == null) {
			return false;
		}
		list[count] = student;
		count++;
		return true;
	}

	public boolean remove(int index) {
		if (index >= count || index < 0) {
			return false;
		}
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		count--;
		list[count] = null;
		return true;
	}

	public int indexOf(String id) {
		for (int i = 0; i < count; i++) {
			if (list[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	public Student get(int index) {
		return list[index];
	}

	public int size() {
		return count;
	}

	public String toString() {
		String info = "";
		for (int i = 0; i < count; i++) {
			info += list[i].toString() + "\n";
		}
		return info;
	}

}