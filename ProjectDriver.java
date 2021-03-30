package One;

import java.util.Scanner;

public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入工程名：");
		String projectName = scan.next();
		System.out.println("请输入预算：");
		double budget = scan.nextDouble();
		
		System.out.println("请输入雇员1名字：");
		String emp1name = scan.next();
		System.out.println("请输入雇员1部门：");
		String emp1department = scan.next();
		System.out.println("请输入雇员1薪水：");
		double emp1baseSalry = scan.nextDouble();
		
		System.out.println("请输入雇员2名字：");
		String emp2name = scan.next();
		System.out.println("请输入雇员2部门：");
		String emp2department = scan.next();
		System.out.println("请输入雇员2薪水：");
		double emp2baseSalry = scan.nextDouble();
		
		Employee emp1= new Employee(emp1name,emp1department,emp1baseSalry);
		Employee emp2= new Employee(emp2name,emp2department,emp2baseSalry);
		Project pro = new Project(projectName,budget,emp1,emp2);
		
		pro.updateBudget();
		System.out.println("更新后的预算为："+pro.getBudget());
		System.out.println(pro.toString());
		
	}

}
