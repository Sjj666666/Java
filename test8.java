package week3;

import java.util.Scanner;

public class test8 {
	public static double score[];

	public static void main(String[] args) {
		int choose = menu();
		double average;
		double highestGrade;
		double lowestGrade;
		double score[] = null;
		score = new double[5];
		while (choose != 5) {
			switch (choose) {
			case 1:
				studentResultsEnter();
				break;
			case 2:
				if (score == null) {
					System.out.println("请先输入成绩!");
					break;
				}
				average = Average();
				System.out.println("平均分：" + average);
				break;
			case 3:
				highestGrade = Highest();
				System.out.println("最高分：" + highestGrade);
				break;
			case 4:
				lowestGrade = Lowest();
				System.out.println("最低分：" + lowestGrade);
				break;
			}
			choose = menu();
		}
		System.out.println("over");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("1.Enter Student Results");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Low Grade");
		System.out.println("5.Exit ");
		System.out.println("Please choose(1-5)");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void studentResultsEnter() {
		score = new double[5];
		System.out.println("please intput five students grade:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个成绩：");
			boolean ok = false;
			while (!ok) {
				score[i] = scan.nextDouble();
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("输入无效，重新输入");
				} else {
					ok = true;
				}
			}
		}
	}

	public static double Average() {
		double average;
		double sum = 0;
		if (score == null) {
			return 0;
		}
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / score.length;
		return average;
	}

	public static double Highest() {
		double highestGrade = score[1];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > highestGrade) {
				highestGrade = score[i];
			}
		}
		return highestGrade;
	}

	public static double Lowest() {
		double lowestGrade = score[1];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < lowestGrade) {
				lowestGrade = score[i];
			}
		}
		return lowestGrade;
	}

}
