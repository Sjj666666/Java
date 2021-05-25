package week12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Dao {
	public ArrayList<Student> inputStudent() {
		ArrayList<Student> listStudent = new ArrayList<Student>();
		System.out.println("请输入学生基本信息(每个学生一行,输入格式为“学号,姓名,性别”,输入end结束):");
		Scanner scan = new Scanner(System.in);
		String aLine = scan.nextLine();
		while (!aLine.equalsIgnoreCase("end")) {
			String array[] = aLine.split(",|，");
			Student student = new Student(array[0], array[1], array[2]);
			listStudent.add(student);
			aLine = scan.nextLine();
		}
		return listStudent;
	}

	public ArrayList<Student> inputStudentFromTxt() {
		ArrayList<Student> listStudent = new ArrayList<Student>();
		try {
			File file = new File("D:/java--作业/week12/student.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String aLine = "";
			while ((aLine = br.readLine())!=null) {
				String array[] = aLine.split(",|，");
				Student student = new Student(array[0], array[1], array[2]);
				listStudent.add(student);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listStudent;
	}

	public ArrayList<Course> inputCourse() {
		ArrayList<Course> listCourse = new ArrayList<Course>();
		System.out.println("请输入学生成绩(每个成绩一行,输入格式为“学号,课程名称,成绩”,输入end结束):");
		Scanner scan = new Scanner(System.in);
		String aLine = scan.nextLine();
		while (!aLine.equalsIgnoreCase("end")) {
			String array[] = aLine.split(",|，");
			Course course = new Course(array[0], array[1], Double.parseDouble(array[2]));
			listCourse.add(course);
			aLine = scan.nextLine();
		}
		return listCourse;
	}

	public ArrayList<Course> inputCourseFromTxt() {
		ArrayList<Course> listCourse = new ArrayList<Course>();
		try {
			File file = new File("D:/java--作业/week12/course.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String aLine = "";
			while ((aLine = br.readLine())!=null) {
				String array[] = aLine.split(",|，");
				Course course = new Course(array[0], array[1], Double.parseDouble(array[2]));
				listCourse.add(course);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listCourse;
	}

	public ArrayList<Student> processByStudent(ArrayList<Student> listStudent,ArrayList<Course> listCourse) {
		ArrayList<Student> listStuResult = new ArrayList<Student>();
		for (Student student : listStudent) {
			int cnt=0;
			double Score=0;
			String id=student.getID();
			for (Course course : listCourse) {
				if(course.getID().equalsIgnoreCase(id)) {
					cnt++;
					Score+=course.getScore();
				}
			}
			Student stu = new Student(student.getID(),student.getName(),
					student.getGender(),Score/cnt);
			listStuResult.add(stu);
		}
		return listStuResult;
	}

	public ArrayList<Result> processByCourse(ArrayList<Course> listCourse) {
		ArrayList<Result> listCouResult = new ArrayList<Result>();
		for (Course course : listCourse) {
			int cnt=0;
			double Score=0;
			String courseName=course.getCourseName();
			int flag=exist(listCouResult,courseName);
			if(flag==-1) {
				for (Course course1 : listCourse) {
					if(course1.getCourseName().equalsIgnoreCase(courseName)) {
						Score+=course1.getScore();
						cnt++;
					}
				}
				Result result = new Result(courseName,Score/cnt);
				listCouResult.add(result);
			}
		}
		return listCouResult;
	}

	public void output(ArrayList<Student> listStuResult,ArrayList<Result> listCouResult) {
		System.out.println("按学生统计：");
		System.out.println("学号\t姓名\t性别\t平均分");
		for (Student student : listStuResult) {
			System.out.println(student.toString());		
		}
		System.out.println("按课程统计：");
		System.out.println("课程\t平均分");
		for (Result result : listCouResult) {
			System.out.println(result.toString());
		}
	}

	public void outputFromTxt(ArrayList<Student> listStuResult,ArrayList<Result> listCouResult) {
		try{
			File aFile = new File("D:/java--作业/week12/Score.txt");
			FileWriter fw = new FileWriter(aFile);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("按学生统计：");
			pw.println("学号\t姓名\t性别\t平均分");
			for (Student student : listStuResult) {
				pw.println(student.toString());		
			}
			pw.println("按课程统计：");
			pw.println("课程\t平均分");
			for (Result result : listCouResult) {
				pw.println(result.toString());
			}
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	private int exist(ArrayList<Result> listCouResult,String courseName) {
		for (Result result : listCouResult) {
			if(result.getCourseName().equalsIgnoreCase(courseName)) {
				return 1;
			}
		}
		return -1;
	}
	
}
