package week3;

import java.util.Scanner;

public class 学生成绩 {
	public static double score[];
	public static int flag = 0;

	public static void main(String[] args) {
		int choose = menu();
		double average, maxscore, minscore;
		while (choose != 6) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				average = getaverage();
				System.out.println("学生平均成绩为：" + average);
				break;
			case 3:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				maxscore = High();
				System.out.println("学生成绩最高为：" + maxscore);
				break;
			case 4:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				minscore = Low();
				System.out.println("学生成绩最低为：" + minscore);
				break;
			case 5:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				System.out.println("学生成绩从小到大排序为：");
				getsort();
				break;
			default:
				System.out.println("输入无效，重新输入！");
			}
			choose = menu();
		}
		System.out.println("程序退出，欢迎再次使用！");
	}

	/*
	 * 完成菜单的显示，返回用户的输入选择（1-5）
	 */
	public static int menu() {
		int choice = 0;
		System.out.println("==================");
		System.out.println("1.Enter score");
		System.out.println("2.Average");
		System.out.println("3.High");
		System.out.println("4.Low");
		System.out.println("5.sort");
		System.out.println("6.Exit");
		System.out.print("please choose(1-6): ");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	// 输入成绩
	public static void input() {
		score = new double[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生成绩：");
			score[i] = scan.nextDouble();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("输入异常，请重新输入学生成绩！");
				i--;
			}
		}
		flag = 1;
	}

	// 平均成绩
	public static double getaverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / score.length;
		return average;
	}

	// 最高成绩
	public static double High() {
		double max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		return max;
	}

	// 最低成绩
	public static double Low() {
		double min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		return min;
	}

	// 成绩排序
	public static void getsort() {
		double min = score[0];
		int k=0;
		for (int j = 0; j < score.length; j++) {
			for (int i = 0; i < score.length; i++) {
				if (min > score[i]) {
					min = score[i];
					k=i;
				}
			}
			System.out.print(min + " ");
			min = 101;
			score[k]=101;
		}
		System.out.println("");
	}
}
