package week3;

import java.util.Scanner;

public class ˮ�ɻ��� {
	public static void main(String args[]) {
		int n, i, a;
		System.out.println("������һ��Nλ����");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int chushi = i;
			int sum = 0;
			while (chushi != 0) {
				a = chushi % 10;
				sum = sum + (int) Math.pow(a, n);
				chushi = chushi / 10;
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}

}