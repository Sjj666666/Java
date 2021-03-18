package week3;

import java.util.Scanner;

public class 两个整数 {
	public static int integers[] = null;
	public static int flag = 0;

	public static void main(String[] args) {
		int choice = menu();
		while (choice != 6) {
			switch (choice) {
			case 1:
				integers();
				break;
			case 2:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				allodd();
				break;
			case 3:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				allevensum();
				break;
			case 4:
				squares();
				break;
			case 5:
				if (flag == 0) {
					System.out.println("输入异常，请先输入选项1！");
					break;
				}
				alloddsum();
				break;
			default:
				System.out.println("输入无效，请输入1-5");
				break;
			}
			choice = menu();
		}
		System.out.println("程序结束，欢迎下次使用！");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("==========请输入1-5选项！===========");
		System.out.println("1.输入两个整数（第一个整数要小于第二个整数）：");
		System.out.println("2.两个整数之间的所有奇数为：");
		System.out.println("3.两个整数之间的所有偶数和为：");
		System.out.println("4.1-10之间所有数及其平方为：");
		System.out.println("5.两个整数之间的所有奇数平方和为：");
		System.out.println("6.退出");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
	//输入两个整数
	public static void integers(){
		integers = new int[2];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<integers.length;i++){
			System.out.print("请输入第"+(i+1)+"整数：");
			integers[i] = scan.nextInt();
			}
		if(integers[0]>=integers[1]){	
			System.out.println("输入错误，请重新输入两个整数!");
			integers();
		}
		flag=1;
	}
	//所有奇数
	public static void allodd(){
		int cnt=0;
		System.out.print(integers[0]+"和"+integers[1]+"之间奇数为：");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2!=0){
				System.out.print(i+" ");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("空！");
		}
		else {
			System.out.println("");
		}
	}
	//所有偶数和
	public static void allevensum(){
		int sum=0,cnt=0;
		System.out.print(integers[0]+"和"+integers[1]+"之间偶数为：");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2==0){
				System.out.print(i+" ");
				sum=sum+i;
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("空！");
		}
		else {
			System.out.println("");
		}
		System.out.println("偶数和为："+sum);
	}
	//输出1-10之间所有数和数的平方
	public static void squares() {
		System.out.print("1-10之间所有数为：");
		for (int i = 2; i < 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.print("1-10之间所有数的平方为：");
		for (int i = 2; i < 10; i++) {
			System.out.print((int)Math.pow(i, 2)+" ");
		}
		System.out.println("");
	}
	//输出两个整数之间的所有奇数和
	public static void alloddsum() {
		int cnt=0,sum=0;
		System.out.print(integers[0]+"和"+integers[1]+"之间奇数为：");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2!=0){
				System.out.print(i+" ");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("空！");
		}
		else {
			System.out.println("");
			System.out.print(integers[0]+"和"+integers[1]+"之间奇数平方和为：");
			for (int i = integers[0]+1; i < integers[1]; i++) {
				if(i%2!=0) {
					sum=sum+(int)Math.pow(i, 2);
				}
			}
			System.out.println(sum);
		}
	}
}










