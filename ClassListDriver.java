package Two;

import java.util.Scanner;

public class ClassListDriver {
	
	public static ClassList classlist = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose=0;
		while(choose!=3) {
			switch(choose) {
			case 1:creatList();break;
			case 2:printList();break;
			default:System.out.println("输入无效，请重新输入！");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用！");
	}
	
	public static int menu() {
		int choose=0;
		System.out.println("=======WTU======");
		System.out.println("1.创建学生表");
		System.out.println("2.打印学生表");
		System.out.println("3.退出");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void creatList() {
		Scanner scan = new Scanner(System.in);
		if(classlist!=null) {
			System.out.println("您已创建学生表，是否重新创建？（Y/N）");
			String again = scan.next();
			if(again.equalsIgnoreCase("n")) {
				return;
			}
		}
			System.out.println("请输入学年：");
			int year = scan.nextInt();
			System.out.println("请输入学期(1/2)：");
			int semester = scan.nextInt();
			System.out.println("请输入课程代码：");
			String subjectID = scan.next();
			System.out.println("请输入课程名称：");
			String subjectName = scan.next();
			System.out.println("请输入学生1姓名：");
			String s1Name = scan.next();
			System.out.println("请输入学生1学号：");
			String s1ID = scan.next();
			System.out.println("请输入学生2姓名：");
			String s2Name = scan.next();
			System.out.println("请输入学生2学号：");
			String s2ID = scan.next();
			
			Student s1 = new Student(s1ID,s1Name);
			Student s2 = new Student(s2ID,s2Name);
			Subject subj = new Subject(subjectID,subjectName);
			classlist = new ClassList(semester,year,subj,s1,s2);
			return;
	}
	
	public static void printList() {
		if(classlist==null) {
			System.out.println("请先输入选项1创建学生表！");
			return;
		}
		System.out.println(classlist.toString());
	}
}
