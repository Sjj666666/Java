package week3;

import java.util.Scanner;

public class ���ͽ����� {
	public static void main(String args[]) {
		System.out.println("������N��*�ͽ�������");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
