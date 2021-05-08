package Test5;

import java.util.ArrayList;
import java.util.Scanner;

public class Dao {
	public ArrayList<Student> input1() {
		ArrayList<Student> list1 = new ArrayList<Student>();
		System.out.println("请输入学生基本信息:(每个学生一行，输入格式为“学号,姓名,性别”,当输入“end”时结束)");
		Scanner scan = new Scanner(System.in);
		String message = scan.next();
		while (!message.equalsIgnoreCase("end")) {
			String array[] = message.split(",|，");
			String ID = array[0];
			String name = array[1];
			String gender = array[2];
			Student stu = new Student(ID, name, gender);
			list1.add(stu);
			message = scan.next();
		}
		return list1;
	}

	public ArrayList<Score> input2() {
		ArrayList<Score> list2 = new ArrayList<Score>();
		System.out.println("请输入学生成绩:(每个成绩一行，输入格式为“学号,课程名称,成绩”,当输入“end”时结束))");
		Scanner scan = new Scanner(System.in);
		String message = scan.next();
		while (!message.equalsIgnoreCase("end")) {
			String array[] = message.split(",|，");
			String ID = array[0];
			String courseName = array[1];
			double score = Double.parseDouble(array[2]);
			Score stuScore = new Score(ID, courseName, score);
			list2.add(stuScore);
			message = scan.next();
		}
		return list2;
	}

	public ArrayList<stuScoreResult> studentScore(ArrayList<Student> list1, ArrayList<Score> list2) {
		ArrayList<stuScoreResult> listResult1 = new ArrayList<stuScoreResult>();
		for (Student Student : list1) {
			double aveScore = 0;
			double cnt = 0;
			String ID = Student.getID();
			String name = Student.getName();
			String gender = Student.getGender();
			int flag = exist1(listResult1, ID);
			for (Score Score : list2) {
				if (Score.getID().equalsIgnoreCase(ID)) {
					aveScore += Score.getScore();
					cnt++;
				}
			}
			if (flag == -1) {
				stuScoreResult stu = new stuScoreResult(ID, name, gender, aveScore / cnt);
				listResult1.add(stu);
			}
		}
		return listResult1;
	}

	public ArrayList<couScoreResult> couScore(ArrayList<Score> list2) {
		ArrayList<couScoreResult> listResult2 = new ArrayList<couScoreResult>();
		for (Score Score : list2) {
			double aveScore = 0;
			double cnt = 0;
			String couName = Score.getCourseName();
			int flag = exist2(listResult2, couName);
			for (int i = 0; i < list2.size(); i++) {
				Score line = list2.get(i);
				if (line.getCourseName().equalsIgnoreCase(couName)) {
					cnt++;
					aveScore += line.getScore();
				}
			}
			if (flag == -1) {
				couScoreResult cou = new couScoreResult(couName, aveScore / cnt);
				listResult2.add(cou);
			}
		}
		return listResult2;
	}

	public void output(ArrayList<stuScoreResult> listResult1, ArrayList<couScoreResult> listResult2) {
		System.out.println("按学生统计:");
		System.out.println("学号\t" + "姓名\t" + "性别\t" + "平均分\t");
		for (stuScoreResult stuScoreResult : listResult1) {
			System.out.println(stuScoreResult.toString());
		}
		System.out.println("按课程统计:");
		System.out.println("课程\t" + "平均分");
		for (couScoreResult couScoreResult : listResult2) {
			System.out.println(couScoreResult.toString());
		}
	}

	public int exist1(ArrayList<stuScoreResult> listResult1, String ID) {
		for (int i = 0; i < listResult1.size(); i++) {
			stuScoreResult result = listResult1.get(i);
			if (result.getID().equalsIgnoreCase(ID)) {
				return i;
			}
		}
		return -1;
	}

	public int exist2(ArrayList<couScoreResult> listResult2, String couName) {
		for (int i = 0; i < listResult2.size(); i++) {
			couScoreResult result = listResult2.get(i);
			if (result.getCourseName().equalsIgnoreCase(couName)) {
				return i;
			}
		}
		return -1;
	}

}
