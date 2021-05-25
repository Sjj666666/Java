package week12;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		ArrayList<Student> listStudent = null;
		ArrayList<Course> listCourse = null;
		ArrayList<Student> listStuResult = null;
		ArrayList<Result> listCouResult = null;
		int choose = menu();
		while (choose != 9) {
			switch (choose) {
			case 1:
				listStudent = dao.inputStudent();
				System.out.println("输入成功！");
				break;
			case 2:
				listStudent = dao.inputStudentFromTxt();
				System.out.println("导入成功！");
				break;
			case 3:
				listCourse = dao.inputCourse();
				System.out.println("输入成功！");
				break;
			case 4:
				listCourse = dao.inputCourseFromTxt();
				System.out.println("导入成功！");
				break;
			case 5:
				listStuResult = dao.processByStudent(listStudent, listCourse);
				System.out.println("计算成功！");
				break;
			case 6:
				listCouResult = dao.processByCourse(listCourse);
				System.out.println("计算成功！");
				break;
			case 7:
				dao.output(listStuResult, listCouResult);
				break;
			case 8:
				dao.outputFromTxt(listStuResult, listCouResult);
				System.out.println("导入成功！");
				break;
			default:
				System.out.println("输入无效，请重新输入！");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用！");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("====================");
		System.out.println("1.输入学生基本信息");
		System.out.println("2.从TXT文本导入学生基本信息");
		System.out.println("3.输入学生成绩");
		System.out.println("4.从TXT文本导入学生成绩");
		System.out.println("5.计算学生平均成绩");
		System.out.println("6.计算课程评价成绩");
		System.out.println("7.打印出结果");
		System.out.println("8.将结果导入TXT文本");
		System.out.println("9.退出");
		System.out.print("请输入你的选项：");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
}
