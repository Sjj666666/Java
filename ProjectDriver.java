package One;

import java.util.Scanner;

public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�����빤������");
		String projectName = scan.next();
		System.out.println("������Ԥ�㣺");
		double budget = scan.nextDouble();
		
		System.out.println("�������Ա1���֣�");
		String emp1name = scan.next();
		System.out.println("�������Ա1���ţ�");
		String emp1department = scan.next();
		System.out.println("�������Ա1нˮ��");
		double emp1baseSalry = scan.nextDouble();
		
		System.out.println("�������Ա2���֣�");
		String emp2name = scan.next();
		System.out.println("�������Ա2���ţ�");
		String emp2department = scan.next();
		System.out.println("�������Ա2нˮ��");
		double emp2baseSalry = scan.nextDouble();
		
		Employee emp1= new Employee(emp1name,emp1department,emp1baseSalry);
		Employee emp2= new Employee(emp2name,emp2department,emp2baseSalry);
		Project pro = new Project(projectName,budget,emp1,emp2);
		
		pro.updateBudget();
		System.out.println("���º��Ԥ��Ϊ��"+pro.getBudget());
		System.out.println(pro.toString());
		
	}

}
