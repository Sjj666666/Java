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
				System.out.print("������ѧ��ѧ��:");
				String id = scan.nextLine();
				stu = dao.get(id);
				if (stu == null) {
					System.out.println("û�и�ѧ����Ϣ!");
				} else {
					System.out.println(stu.toString());
				}
				break;
			case 2:
				System.out.print("������fieldName:");
				String fieldName = scan.nextLine();
				System.out.print("������value:");
				String value = scan.nextLine();
				query = dao.query(fieldName, value);
				if (query == null) {
					System.out.println("û�и�ѧ����Ϣ!");
				} else {
					System.out.println(query.toString());
				}
				break;
			case 3:
				list = dao.readStudentFromKeyBoard();
				if (dao.insert(list) > 0) {
					System.out.println("��ӳɹ�!");
				} else {
					System.out.println("���ʧ��!");
				}
				break;
			case 4:
				System.out.print("��������Ҫɾ����ѧ��ID��");
				String id1 = scan.nextLine();
				if (dao.delete(id1) > 0) {
					System.out.println("ɾ���ɹ�!");
				} else {
					System.out.println("ɾ��ʧ��!");
				}
				break;
			case 5:
				System.out.print("������Ҫ���µ�ѧ��ID��");
				String id2 = scan.nextLine();
				System.out.println("����������Ҫ���µ�ѧ����Ϣ��");
				String message = scan.nextLine();
				String array[] = message.split(",|��");
				stu = new Student(array[0], array[1], array[2], array[3], Double.parseDouble(array[4]));
				if (dao.update(stu,id2) > 0) {
					System.out.println("���³ɹ�!");
				} else {
					System.out.println("����ʧ��!");
				}
				break;
			default:
				System.out.println("������Ч,����������!");
			}
			choice = menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.����ѧ�Ų�ѯѧ����Ϣ");
		System.out.println("2.����fieldName��value��ѯ(���磺gender ��)");
		System.out.println("3.����ѧ����Ϣ");
		System.out.println("4.����ѧ��ɾ��ѧ����Ϣ");
		System.out.println("5.����ѧ����Ϣ");
		System.out.println("6.�˳�");
		System.out.print("���������ѡ��:");
		int choice = scan.nextInt();
		return choice;
	}

}
