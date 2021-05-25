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
				System.out.println("����ɹ���");
				break;
			case 2:
				listStudent = dao.inputStudentFromTxt();
				System.out.println("����ɹ���");
				break;
			case 3:
				listCourse = dao.inputCourse();
				System.out.println("����ɹ���");
				break;
			case 4:
				listCourse = dao.inputCourseFromTxt();
				System.out.println("����ɹ���");
				break;
			case 5:
				listStuResult = dao.processByStudent(listStudent, listCourse);
				System.out.println("����ɹ���");
				break;
			case 6:
				listCouResult = dao.processByCourse(listCourse);
				System.out.println("����ɹ���");
				break;
			case 7:
				dao.output(listStuResult, listCouResult);
				break;
			case 8:
				dao.outputFromTxt(listStuResult, listCouResult);
				System.out.println("����ɹ���");
				break;
			default:
				System.out.println("������Ч�����������룡");
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("====================");
		System.out.println("1.����ѧ��������Ϣ");
		System.out.println("2.��TXT�ı�����ѧ��������Ϣ");
		System.out.println("3.����ѧ���ɼ�");
		System.out.println("4.��TXT�ı�����ѧ���ɼ�");
		System.out.println("5.����ѧ��ƽ���ɼ�");
		System.out.println("6.����γ����۳ɼ�");
		System.out.println("7.��ӡ�����");
		System.out.println("8.���������TXT�ı�");
		System.out.println("9.�˳�");
		System.out.print("���������ѡ�");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
}
