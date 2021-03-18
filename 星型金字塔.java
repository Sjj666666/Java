package week3;

import java.util.Scanner;

public class 星型金字塔 {
	public static void main(String args[]) {
		System.out.println("请输入N行*型金字塔：");
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
