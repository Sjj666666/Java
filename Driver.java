package week6;

import java.util.Scanner;

public class Driver {
	public static Customer customerSaving;
	public static Customer customerChecking;
	public static CheckingAccount ca;
	public static SavingsAccount sa;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 8) {
			switch (choose) {
			case 1:
				create();
				break;
			case 2:
				save();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				comsume();
				break;
			case 5:
				repay();
				break;
			case 6:
				settle();
				break;
			case 7:
				balance();
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
		Scanner scan = new Scanner(System.in);
		System.out.println("==========��ӭʹ������ϵͳ========");
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8.�˳�");
		System.out.print("��ѡ��1-8��:");
		choose = scan.nextInt();
		return choose;
	}

	public static void create() {
		int choice = smallmenu();
		while (choice != 3) {
			switch (choice) {
			case 1:
				createChecking();
				break;
			case 2:
				createSaving();
				break;
			default:
				System.out.println("������Ч����������!");
			}
			choice = smallmenu();
		}
	}

	public static int smallmenu() {
		int choose = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.���ÿ�");
		System.out.println("2.�洢��");
		System.out.println("3.����");
		System.out.print("��ѡ��1-3��:");
		choose = scan.nextInt();
		return choose;
	}

	public static void createChecking() {
		if (ca != null) {
			System.out.println("������ÿ��ѳɹ�����!�����ظ�������");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("���������֤��(ssn):");
		String ssn = scan.next();
		System.out.print("����������(name):");
		String name = scan.next();
		System.out.print("�����뿨��:");
		String accountNum = scan.next();
		System.out.print("����������:");
		double serviceCharge = scan.nextDouble();
		ca = new CheckingAccount(accountNum, 2000, serviceCharge);
		customerChecking = new Customer(ssn, name, ca, null);
		System.out.println("���ÿ������ɹ�,���ö��Ϊ2000!���������!");
	}

	public static void createSaving() {
		if (sa != null) {
			System.out.println("��Ĵ洢���ѳɹ�����!�������¿���!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("���������֤��(ssn):");
		String ssn = scan.next();
		System.out.print("����������(name):");
		String name = scan.next();
		System.out.print("�����뿨��:");
		String accountNum = scan.next();
		System.out.print("����������:");
		double interestRate = scan.nextDouble();
		sa = new SavingsAccount(accountNum, 0, interestRate);
		customerSaving = new Customer(ssn, name, null, sa);
		System.out.println("�洢�������ɹ�!���������!");
	}

	public static void save() {
		if (sa == null) {
			System.out.println("����ѡ��1.����,���д洢����������!");
			return;
		}
		System.out.print("��������Ҫ���Ľ�");
		Scanner scan = new Scanner(System.in);
		double save = scan.nextDouble();
		if (save < 0) {
			System.out.println("������ȷ,���ʧ��!");
			return;
		}
		sa.setBalance(sa.getBalance() + save);
		System.out.println("���ɹ�!���������!");
	}

	public static void withdraw() {
		if (sa == null) {
			System.out.println("����ѡ��1.����,���д洢����������!");
			return;
		}
		System.out.print("��������Ҫȡ��Ľ�");
		Scanner scan = new Scanner(System.in);
		double withdraw = scan.nextDouble();
		if (withdraw > sa.getBalance()) {
			System.out.println("�Բ�������!ȡ��ʧ��!");
			return;
		}
		if (withdraw < 0) {
			System.out.println("ȡ�����ȷ,ȡ��ʧ��!");
			return;
		}
		sa.setBalance(sa.getBalance() - withdraw);
		System.out.println("ȡ��ɹ�!���������!");
	}

	public static void comsume() {
		if (ca == null) {
			System.out.println("����ѡ��1.����,�������ÿ���������!");
			return;
		}
		System.out.print("��������Ҫ���ѵĽ�");
		Scanner scan = new Scanner(System.in);
		double comsume = scan.nextDouble();
		if (comsume > ca.getBalance()) {
			System.out.println("�Բ���,���ö�Ȳ���!����ʧ��!");
			return;
		}
		if (comsume < 0) {
			System.out.println("���ѽ���ȷ,����ʧ��!");
			return;
		}
		ca.setBalance(ca.getBalance() - comsume);
		System.out.println("���ѳɹ�!���������!");
	}

	public static void repay() {
		if (ca == null) {
			System.out.println("����ѡ��1.����,�������ÿ���������!");
			return;
		}
		System.out.println("������ÿ���Ҫ��" + (2000 - ca.getBalance()) + "Ԫ!");
		System.out.print("��������Ҫ����Ľ�");
		Scanner scan = new Scanner(System.in);
		double repay = scan.nextDouble();
		if (repay > (2000 - ca.getBalance()) || repay < 0) {
			System.out.println("�Բ���,�������ȷ,����ʧ��!");
			return;
		}
		ca.setBalance(ca.getBalance() + repay);
		System.out.println("����ɹ�!���軹" + (2000 - ca.getBalance()) + "Ԫ!");
		System.out.println("���������!");
	}

	public static void settle() {
		if (sa == null && ca == null) {
			System.out.println("�Բ���,���н���ʧ��!���ȿ���!");
			return;
		}
		if (sa == null) {
			System.out.println("���ÿ�:");
			System.out.println("��ķ����Ϊ:" + ca.getServiceCharge());
			ca.assessServiceCharge();
			System.out.println("�����,������ÿ����Ϊ:" + ca.getBalance());
			return;
		}
		if (ca == null) {
			System.out.println("�洢��:");
			System.out.println("�������Ϊ:" + sa.getInterestRate());
			sa.payInterest();
			System.out.println("�����,��Ĵ洢�����Ϊ:" + sa.getBalance());
			return;
		}
		System.out.println("���ÿ�:");
		System.out.println("��ķ����Ϊ:" + ca.getServiceCharge());
		ca.assessServiceCharge();
		System.out.println("�����,������ÿ����Ϊ:" + ca.getBalance());
		System.out.println("�洢��:");
		System.out.println("�������Ϊ:" + sa.getInterestRate());
		sa.payInterest();
		System.out.println("�����,��Ĵ洢�����Ϊ:" + sa.getBalance());
	}

	public static void balance() {
		if (sa == null && ca == null) {
			System.out.println("�Բ���,��ѯ���ʧ��!���ȿ���!");
			return;
		}
		if (sa == null) {
			System.out.println("���ÿ���");
			System.out.println(customerChecking.toString() + ca.toString());
			System.out.println("��ѯ���!���������!");
			return;
		}
		if (ca == null) {
			System.out.println("�洢����");
			System.out.println(customerSaving.toString() + sa.toString());
			System.out.println("��ѯ���!���������!");
			return;
		}
		System.out.println("���ÿ���");
		System.out.println(customerChecking.toString() + ca.toString());
		System.out.println("�洢����");
		System.out.println(customerSaving.toString() + sa.toString());
		System.out.println("��ѯ���!���������!");
	}

}
