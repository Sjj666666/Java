package week7;

import java.util.Scanner;

public class Driver {

	public static Subject subj;
	public static Enrollment enroll;
	public static Student stu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				createSubject();
				break;
			case 2:
				addSubject();
				break;
			case 3:
				withDraw();
				break;
			case 4:
				printDetail();
				break;
			default:
				System.out.println("输入无效，请重新输入!");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用!");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("========WTU选课系统========");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.print("请选择(1-5):");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void createSubject() {
		Scanner scan = new Scanner(System.in);
		if(subj!=null) {
			boolean flag=true;
			System.out.print("课程已存在，是否重新创建(n/y):");
			String again = scan.next();
			while(flag) {
				if(again.equalsIgnoreCase("n")) {
					return;
				}
				else if(again.equalsIgnoreCase("y")) {
					System.out.println("请重新创建课程!");
					flag=false;
				}
				else {
					System.out.println("输入无效，请重新输入!");
					System.out.print("课程已存在，是否重新创建(n/y):");
					again = scan.next();
				}
			}
			
		}
		System.out.print("请输入课程ID:");
		String Subjectid = scan.next();
		System.out.print("请输入课程名:");
		String Subjectname = scan.next();
		System.out.print("请输入课程最大人数:");
		int maxNum = scan.nextInt();
		while(maxNum<=0) {
			System.out.println("输入无效，请输入大于0的数!");
			System.out.print("请输入课程最大人数:");
			maxNum = scan.nextInt();
		}
		subj = new Subject(Subjectid, Subjectname, maxNum);
		System.out.println("课程信息为:");
		System.out.println(subj.toString());
		enroll = new Enrollment(subj);
	}

	public static void addSubject() {
		if (subj == null) {
			System.out.println("请先创建课程!");
			return;
		}
		if (enroll.size()>=subj.getMaxNum()) {
			System.out.println("人数已满，无法选课!");
			System.out.println("当前选课人数为:" + enroll.size());
			System.out.print("学生ID\t" + "学生姓名\n" + enroll.toString());
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入学生id:");
		String Studentid = scan.next();
		System.out.print("请输入学生姓名:");
		String Studentname = scan.next();
		stu = new Student(Studentid, Studentname);
		if(enroll.add(stu)) {
			System.out.println("选课成功!");
		}
		System.out.println("当前选课人数为:" + enroll.size());
		System.out.print("学生ID\t" + "学生姓名\n" + enroll.toString());
	}

	public static void withDraw() {
		if (subj == null) {
			System.out.println("请先创建课程!");
			return;
		}
		System.out.print("请输入退选学生id:");
		Scanner scan = new Scanner(System.in);
		String studentId = scan.next();
		if (enroll.remove(enroll.indexOf(studentId))) {
			System.out.println("退选成功!");
		} else {
			System.out.println("退选失败,学号"+studentId+"的学生未选课!");
		}
		System.out.println("当前选课人数为:" + enroll.size());
		System.out.print("学生ID\t" + "学生姓名\n" + enroll.toString());
	}

	public static void printDetail() {
		if (subj == null) {
			System.out.println("请先创建课程!");
			return;
		}
		System.out.println("课程信息为:");
		System.out.println(subj.toString());
		System.out.println("当前选课人数为:" + enroll.size());
		System.out.print("学生ID\t" + "学生姓名\n" + enroll.toString());

	}
}