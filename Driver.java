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
				System.out.println("输入无效，请重新输入!");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用!");
	}

	public static int menu() {
		int choose = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("==========欢迎使用银行系统========");
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8.退出");
		System.out.print("请选择（1-8）:");
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
				System.out.println("输入无效请重新输入!");
			}
			choice = smallmenu();
		}
	}

	public static int smallmenu() {
		int choose = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.信用卡");
		System.out.println("2.存储卡");
		System.out.println("3.返回");
		System.out.print("请选择（1-3）:");
		choose = scan.nextInt();
		return choose;
	}

	public static void createChecking() {
		if (ca != null) {
			System.out.println("你的信用卡已成功开户!请勿重复开户！");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入身份证号(ssn):");
		String ssn = scan.next();
		System.out.print("请输入姓名(name):");
		String name = scan.next();
		System.out.print("请输入卡号:");
		String accountNum = scan.next();
		System.out.print("请输入服务费:");
		double serviceCharge = scan.nextDouble();
		ca = new CheckingAccount(accountNum, 2000, serviceCharge);
		customerChecking = new Customer(ssn, name, ca, null);
		System.out.println("信用卡开户成功,信用额度为2000!请继续操作!");
	}

	public static void createSaving() {
		if (sa != null) {
			System.out.println("你的存储卡已成功开户!请勿重新开户!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入身份证号(ssn):");
		String ssn = scan.next();
		System.out.print("请输入姓名(name):");
		String name = scan.next();
		System.out.print("请输入卡号:");
		String accountNum = scan.next();
		System.out.print("请输入利率:");
		double interestRate = scan.nextDouble();
		sa = new SavingsAccount(accountNum, 0, interestRate);
		customerSaving = new Customer(ssn, name, null, sa);
		System.out.println("存储卡开户成功!请继续操作!");
	}

	public static void save() {
		if (sa == null) {
			System.out.println("请先选择1.开户,进行存储卡开户操作!");
			return;
		}
		System.out.print("请输入你要存款的金额：");
		Scanner scan = new Scanner(System.in);
		double save = scan.nextDouble();
		if (save < 0) {
			System.out.println("存款金额不正确,存款失败!");
			return;
		}
		sa.setBalance(sa.getBalance() + save);
		System.out.println("存款成功!请继续操作!");
	}

	public static void withdraw() {
		if (sa == null) {
			System.out.println("请先选择1.开户,进行存储卡开户操作!");
			return;
		}
		System.out.print("请输入你要取款的金额：");
		Scanner scan = new Scanner(System.in);
		double withdraw = scan.nextDouble();
		if (withdraw > sa.getBalance()) {
			System.out.println("对不起，余额不足!取款失败!");
			return;
		}
		if (withdraw < 0) {
			System.out.println("取款金额不正确,取款失败!");
			return;
		}
		sa.setBalance(sa.getBalance() - withdraw);
		System.out.println("取款成功!请继续操作!");
	}

	public static void comsume() {
		if (ca == null) {
			System.out.println("请先选择1.开户,进行信用卡开户操作!");
			return;
		}
		System.out.print("请输入你要消费的金额：");
		Scanner scan = new Scanner(System.in);
		double comsume = scan.nextDouble();
		if (comsume > ca.getBalance()) {
			System.out.println("对不起,信用额度不足!消费失败!");
			return;
		}
		if (comsume < 0) {
			System.out.println("消费金额不正确,消费失败!");
			return;
		}
		ca.setBalance(ca.getBalance() - comsume);
		System.out.println("消费成功!请继续操作!");
	}

	public static void repay() {
		if (ca == null) {
			System.out.println("请先选择1.开户,进行信用卡开户操作!");
			return;
		}
		System.out.println("你的信用卡需要还" + (2000 - ca.getBalance()) + "元!");
		System.out.print("请输入你要还款的金额：");
		Scanner scan = new Scanner(System.in);
		double repay = scan.nextDouble();
		if (repay > (2000 - ca.getBalance()) || repay < 0) {
			System.out.println("对不起,还款金额不正确,还款失败!");
			return;
		}
		ca.setBalance(ca.getBalance() + repay);
		System.out.println("还款成功!还需还" + (2000 - ca.getBalance()) + "元!");
		System.out.println("请继续操作!");
	}

	public static void settle() {
		if (sa == null && ca == null) {
			System.out.println("对不起,银行结算失败!请先开户!");
			return;
		}
		if (sa == null) {
			System.out.println("信用卡:");
			System.out.println("你的服务费为:" + ca.getServiceCharge());
			ca.assessServiceCharge();
			System.out.println("结算后,你的信用卡余额为:" + ca.getBalance());
			return;
		}
		if (ca == null) {
			System.out.println("存储卡:");
			System.out.println("你的利率为:" + sa.getInterestRate());
			sa.payInterest();
			System.out.println("结算后,你的存储卡余额为:" + sa.getBalance());
			return;
		}
		System.out.println("信用卡:");
		System.out.println("你的服务费为:" + ca.getServiceCharge());
		ca.assessServiceCharge();
		System.out.println("结算后,你的信用卡余额为:" + ca.getBalance());
		System.out.println("存储卡:");
		System.out.println("你的利率为:" + sa.getInterestRate());
		sa.payInterest();
		System.out.println("结算后,你的存储卡余额为:" + sa.getBalance());
	}

	public static void balance() {
		if (sa == null && ca == null) {
			System.out.println("对不起,查询余额失败!请先开户!");
			return;
		}
		if (sa == null) {
			System.out.println("信用卡：");
			System.out.println(customerChecking.toString() + ca.toString());
			System.out.println("查询完毕!请继续操作!");
			return;
		}
		if (ca == null) {
			System.out.println("存储卡：");
			System.out.println(customerSaving.toString() + sa.toString());
			System.out.println("查询完毕!请继续操作!");
			return;
		}
		System.out.println("信用卡：");
		System.out.println(customerChecking.toString() + ca.toString());
		System.out.println("存储卡：");
		System.out.println(customerSaving.toString() + sa.toString());
		System.out.println("查询完毕!请继续操作!");
	}

}
