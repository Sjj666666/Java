package week3;

import java.util.Scanner;

public class �������� {
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
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				allodd();
				break;
			case 3:
				if (flag == 0) {
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				allevensum();
				break;
			case 4:
				squares();
				break;
			case 5:
				if (flag == 0) {
					System.out.println("�����쳣����������ѡ��1��");
					break;
				}
				alloddsum();
				break;
			default:
				System.out.println("������Ч��������1-5");
				break;
			}
			choice = menu();
		}
		System.out.println("�����������ӭ�´�ʹ�ã�");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("==========������1-5ѡ�===========");
		System.out.println("1.����������������һ������ҪС�ڵڶ�����������");
		System.out.println("2.��������֮�����������Ϊ��");
		System.out.println("3.��������֮�������ż����Ϊ��");
		System.out.println("4.1-10֮������������ƽ��Ϊ��");
		System.out.println("5.��������֮�����������ƽ����Ϊ��");
		System.out.println("6.�˳�");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
	//������������
	public static void integers(){
		integers = new int[2];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<integers.length;i++){
			System.out.print("�������"+(i+1)+"������");
			integers[i] = scan.nextInt();
			}
		if(integers[0]>=integers[1]){	
			System.out.println("�������������������������!");
			integers();
		}
		flag=1;
	}
	//��������
	public static void allodd(){
		int cnt=0;
		System.out.print(integers[0]+"��"+integers[1]+"֮������Ϊ��");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2!=0){
				System.out.print(i+" ");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�գ�");
		}
		else {
			System.out.println("");
		}
	}
	//����ż����
	public static void allevensum(){
		int sum=0,cnt=0;
		System.out.print(integers[0]+"��"+integers[1]+"֮��ż��Ϊ��");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2==0){
				System.out.print(i+" ");
				sum=sum+i;
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�գ�");
		}
		else {
			System.out.println("");
		}
		System.out.println("ż����Ϊ��"+sum);
	}
	//���1-10֮��������������ƽ��
	public static void squares() {
		System.out.print("1-10֮��������Ϊ��");
		for (int i = 2; i < 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.print("1-10֮����������ƽ��Ϊ��");
		for (int i = 2; i < 10; i++) {
			System.out.print((int)Math.pow(i, 2)+" ");
		}
		System.out.println("");
	}
	//�����������֮�������������
	public static void alloddsum() {
		int cnt=0,sum=0;
		System.out.print(integers[0]+"��"+integers[1]+"֮������Ϊ��");
		for(int i=integers[0]+1;i<integers[1];i++){
			if(i%2!=0){
				System.out.print(i+" ");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("�գ�");
		}
		else {
			System.out.println("");
			System.out.print(integers[0]+"��"+integers[1]+"֮������ƽ����Ϊ��");
			for (int i = integers[0]+1; i < integers[1]; i++) {
				if(i%2!=0) {
					sum=sum+(int)Math.pow(i, 2);
				}
			}
			System.out.println(sum);
		}
	}
}










