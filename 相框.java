package week3;

import java.util.Scanner;

public class ��� {
	public static void main(String args[]) {
		// ���峣��
		final float COLORINGMONEY = 0.10f;// ��ɫ�۸�
		final float REGULARMONEY = 0.15f;// ��ͨ���۸�
		final float FANCYMONEY = 0.25f;// �������۸�
		final float CARDBOARDMONEY = 0.02f;// ��Ӳֽ��۸�
		final float GLASSMONEY = 0.07f;// �Ų����۸�
		final float CROWNSMONEY = 0.35f;// ���ڼ۸�

		// �������
		float Length = 0; // ����
		float Width = 0; // ���
		int FrameType = 0; // �������
		int IfColoring = 0; // �Ƿ���ɫ
		int IfCrown = 0; // �Ƿ�������
		float CrownNumber = 0; // ��������

		float AllMoney = 0; // �ܼ۸�
		float FrameMoney = 0; // ���۸�
		float ColoringMoney = 0;// ��ɫ�۸�
		float CrownMoney = 0; // ���ڼ۸�
		float PutMoney = 0;// ΪͼƬ��Ӳֽ����߲����ļ۸�

		// ��������
		System.out.println("������ͼƬ�ĳ��ȺͿ�ȣ���λΪӢ��:");
		Scanner scan = new Scanner(System.in);
		Length = scan.nextFloat();
		Width = scan.nextFloat();

		System.out.println("�������������ͣ�");
		System.out.println("1.��ͨ���      0.�������");
		FrameType = scan.nextInt();

		System.out.println("�������Ƿ�Ϊ�����ɫ��");
		System.out.println("1.Yes      0.No");
		IfColoring = scan.nextInt();

		System.out.println("�������Ƿ�������ڣ�");
		System.out.println("1.Yes      0.No");
		IfCrown = scan.nextInt();
		if (IfCrown == 1) {
			System.out.println("������������ڵĸ���(���Ϊ4)��");
			CrownNumber = scan.nextFloat();
		}

		// ��������
		if (FrameType == 1) {
			FrameMoney = REGULARMONEY * ((Length + Width) * 2 + 4);
		} else {
			FrameMoney = FANCYMONEY * ((Length + Width) * 2 + 4);
		}

		PutMoney = Length * Width * (CARDBOARDMONEY + GLASSMONEY);

		if (IfColoring == 1) {
			ColoringMoney = ((Length + Width) * 2 + 4) * COLORINGMONEY;
		}

		if (IfCrown == 1) {
			CrownMoney = CrownNumber * CROWNSMONEY;
		}

		// �������
		AllMoney = FrameMoney + PutMoney + ColoringMoney + CrownMoney;
		System.out.println("�ܼ۸�Ϊ��" + AllMoney + "��Ԫ");
	}
}
