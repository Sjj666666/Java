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
			default:System.out.println("������Ч�����������룡");
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}
	
	public static int menu() {
		int choose=0;
		System.out.println("=======WTU======");
		System.out.println("1.����ѧ����");
		System.out.println("2.��ӡѧ����");
		System.out.println("3.�˳�");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void creatList() {
		Scanner scan = new Scanner(System.in);
		if(classlist!=null) {
			System.out.println("���Ѵ���ѧ�����Ƿ����´�������Y/N��");
			String again = scan.next();
			if(again.equalsIgnoreCase("n")) {
				return;
			}
		}
			System.out.println("������ѧ�꣺");
			int year = scan.nextInt();
			System.out.println("������ѧ��(1/2)��");
			int semester = scan.nextInt();
			System.out.println("������γ̴��룺");
			String subjectID = scan.next();
			System.out.println("������γ����ƣ�");
			String subjectName = scan.next();
			System.out.println("������ѧ��1������");
			String s1Name = scan.next();
			System.out.println("������ѧ��1ѧ�ţ�");
			String s1ID = scan.next();
			System.out.println("������ѧ��2������");
			String s2Name = scan.next();
			System.out.println("������ѧ��2ѧ�ţ�");
			String s2ID = scan.next();
			
			Student s1 = new Student(s1ID,s1Name);
			Student s2 = new Student(s2ID,s2Name);
			Subject subj = new Subject(subjectID,subjectName);
			classlist = new ClassList(semester,year,subj,s1,s2);
			return;
	}
	
	public static void printList() {
		if(classlist==null) {
			System.out.println("��������ѡ��1����ѧ����");
			return;
		}
		System.out.println(classlist.toString());
	}
}
