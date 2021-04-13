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
				System.out.println("������Ч������������!");
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ��!");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("========WTUѡ��ϵͳ========");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		System.out.print("��ѡ��(1-5):");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void createSubject() {
		Scanner scan = new Scanner(System.in);
		if(subj!=null) {
			boolean flag=true;
			System.out.print("�γ��Ѵ��ڣ��Ƿ����´���(n/y):");
			String again = scan.next();
			while(flag) {
				if(again.equalsIgnoreCase("n")) {
					return;
				}
				else if(again.equalsIgnoreCase("y")) {
					System.out.println("�����´����γ�!");
					flag=false;
				}
				else {
					System.out.println("������Ч������������!");
					System.out.print("�γ��Ѵ��ڣ��Ƿ����´���(n/y):");
					again = scan.next();
				}
			}
			
		}
		System.out.print("������γ�ID:");
		String Subjectid = scan.next();
		System.out.print("������γ���:");
		String Subjectname = scan.next();
		System.out.print("������γ��������:");
		int maxNum = scan.nextInt();
		while(maxNum<=0) {
			System.out.println("������Ч�����������0����!");
			System.out.print("������γ��������:");
			maxNum = scan.nextInt();
		}
		subj = new Subject(Subjectid, Subjectname, maxNum);
		System.out.println("�γ���ϢΪ:");
		System.out.println(subj.toString());
		enroll = new Enrollment(subj);
	}

	public static void addSubject() {
		if (subj == null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		if (enroll.size()>=subj.getMaxNum()) {
			System.out.println("�����������޷�ѡ��!");
			System.out.println("��ǰѡ������Ϊ:" + enroll.size());
			System.out.print("ѧ��ID\t" + "ѧ������\n" + enroll.toString());
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("������ѧ��id:");
		String Studentid = scan.next();
		System.out.print("������ѧ������:");
		String Studentname = scan.next();
		stu = new Student(Studentid, Studentname);
		if(enroll.add(stu)) {
			System.out.println("ѡ�γɹ�!");
		}
		System.out.println("��ǰѡ������Ϊ:" + enroll.size());
		System.out.print("ѧ��ID\t" + "ѧ������\n" + enroll.toString());
	}

	public static void withDraw() {
		if (subj == null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		System.out.print("��������ѡѧ��id:");
		Scanner scan = new Scanner(System.in);
		String studentId = scan.next();
		if (enroll.remove(enroll.indexOf(studentId))) {
			System.out.println("��ѡ�ɹ�!");
		} else {
			System.out.println("��ѡʧ��,ѧ��"+studentId+"��ѧ��δѡ��!");
		}
		System.out.println("��ǰѡ������Ϊ:" + enroll.size());
		System.out.print("ѧ��ID\t" + "ѧ������\n" + enroll.toString());
	}

	public static void printDetail() {
		if (subj == null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		System.out.println("�γ���ϢΪ:");
		System.out.println(subj.toString());
		System.out.println("��ǰѡ������Ϊ:" + enroll.size());
		System.out.print("ѧ��ID\t" + "ѧ������\n" + enroll.toString());

	}
}