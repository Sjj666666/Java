package week3;

import java.util.Scanner;

public class ѧ���ɼ� {
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
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				average = getaverage();
				System.out.println("ѧ��ƽ���ɼ�Ϊ��" + average);
				break;
			case 3:
				if (flag == 0) {
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				maxscore = High();
				System.out.println("ѧ���ɼ����Ϊ��" + maxscore);
				break;
			case 4:
				if (flag == 0) {
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				minscore = Low();
				System.out.println("ѧ���ɼ����Ϊ��" + minscore);
				break;
			case 5:
				if (flag == 0) {
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				System.out.println("ѧ���ɼ���С��������Ϊ��");
				getsort();
				break;
			default:
				System.out.println("������Ч���������룡");
			}
			choose = menu();
		}
		System.out.println("�����˳�����ӭ�ٴ�ʹ�ã�");
	}

	/*
	 * ��ɲ˵�����ʾ�������û�������ѡ��1-5��
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

	// ����ɼ�
	public static void input() {
		score = new double[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("�������" + (i + 1) + "��ѧ���ɼ���");
			score[i] = scan.nextDouble();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("�����쳣������������ѧ���ɼ���");
				i--;
			}
		}
		flag = 1;
	}

	// ƽ���ɼ�
	public static double getaverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / score.length;
		return average;
	}

	// ��߳ɼ�
	public static double High() {
		double max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		return max;
	}

	// ��ͳɼ�
	public static double Low() {
		double min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		}
		return min;
	}

	// �ɼ�����
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
