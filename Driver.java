package Test5;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<Student> list1 = dao.input1();
		ArrayList<Score> list2 = dao.input2();
		ArrayList<stuScoreResult> listResult1 = dao.studentScore(list1, list2);
		ArrayList<couScoreResult> listResult2 = dao.couScore(list2);
		dao.output(listResult1, listResult2);
	}

}
