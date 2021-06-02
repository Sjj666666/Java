package week14.ui;

import java.util.ArrayList;
import java.util.Scanner;

import week14.dao.StudentDao;
import week14.vo.Student;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StudentDao dao = new StudentDao();
		Student stu = null;
		ArrayList<Student> query = null;
		ArrayList<Student> list = null;
		int choice = menu();
		while (choice != 6) {
			switch (choice) {
			case 1:
				System.out.print("请输入学生学号:");
				String id = scan.nextLine();
				stu = dao.get(id);
				if (stu == null) {
					System.out.println("没有该学生信息!");
				} else {
					System.out.println(stu.toString());
				}
				break;
			case 2:
				System.out.print("请输入fieldName:");
				String fieldName = scan.nextLine();
				System.out.print("请输入value:");
				String value = scan.nextLine();
				query = dao.query(fieldName, value);
				if (query == null) {
					System.out.println("没有该学生信息!");
				} else {
					System.out.println(query.toString());
				}
				break;
			case 3:
				list = dao.readStudentFromKeyBoard();
				if (dao.insert(list) > 0) {
					System.out.println("添加成功!");
				} else {
					System.out.println("添加失败!");
				}
				break;
			case 4:
				System.out.print("请输入你要删除的学生ID：");
				String id1 = scan.nextLine();
				if (dao.delete(id1) > 0) {
					System.out.println("删除成功!");
				} else {
					System.out.println("删除失败!");
				}
				break;
			case 5:
				System.out.print("请输入要更新的学生ID：");
				String id2 = scan.nextLine();
				System.out.println("请重新输入要更新的学生信息：");
				String message = scan.nextLine();
				String array[] = message.split(",|，");
				stu = new Student(array[0], array[1], array[2], array[3], Double.parseDouble(array[4]));
				if (dao.update(stu,id2) > 0) {
					System.out.println("更新成功!");
				} else {
					System.out.println("更新失败!");
				}
				break;
			default:
				System.out.println("输入无效,请重新输入!");
			}
			choice = menu();
		}
		System.out.println("欢迎下次使用！");
	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.输入学号查询学生信息");
		System.out.println("2.输入fieldName和value查询(例如：gender 男)");
		System.out.println("3.增加学生信息");
		System.out.println("4.输入学号删除学生信息");
		System.out.println("5.更新学生信息");
		System.out.println("6.退出");
		System.out.print("请输入你的选项:");
		int choice = scan.nextInt();
		return choice;
	}

}
