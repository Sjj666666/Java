package week3;

import java.util.Scanner;

public class ��Ǯ {
	public static void main(String args[]) {
		// ���峣��
		final int FIVECENT = 5;
		final int TENCENT = 10;
		final int TWENTYCENT = 20;
		final int FIFTYCENT = 50;
		final int MONEYTWO = 2;

		// �������
		float Money; // ������
		int MoneyZheng = 0; // ������������
		int MoneyXiaoShu = 0; // ���С������

		int MoneyOneNum = 0; // �����ٸ�1��Ԫ
		int MoneyTwoNum = 0; // �����ٸ�2��Ԫ
		int MoneyOneCentNum = 0; // �����ٸ�1����
		int MoneyFiveCentNum = 0; // �����ٸ�5����
		int MoneyTenCentNum = 0; // �����ٸ�10����
		int MoneyTwentyCentNum = 0; // �����ٸ�20����
		int MoneyFiftyCentNum = 0; // �����ٸ�50����

		// ��������
		System.out.println("��������(����-1��������)��");
		Scanner scan = new Scanner(System.in);
		Money = scan.nextFloat();

		// ���ݴ���+�������
		while (Money != -1) {
			if (Money == 0) {
				System.out.println("������Ч�����������0����ȷ��");
			} else {
				MoneyZheng = (int) Money;
				MoneyTwoNum = MoneyZheng / MONEYTWO;
				MoneyOneNum = MoneyZheng % MONEYTWO;
				MoneyXiaoShu = (int) (Money * 100 - MoneyZheng * 100);
				MoneyFiftyCentNum = MoneyXiaoShu / FIFTYCENT;
				MoneyTwentyCentNum = MoneyXiaoShu % FIFTYCENT / TWENTYCENT;
				MoneyTenCentNum = MoneyXiaoShu % FIFTYCENT % TWENTYCENT / TENCENT;
				MoneyFiveCentNum = MoneyXiaoShu % FIFTYCENT % TWENTYCENT % TENCENT / FIVECENT;
				MoneyOneCentNum = MoneyXiaoShu % FIFTYCENT % TWENTYCENT % TENCENT % FIVECENT;
				System.out.println("����" + Money + "��Ԫ���Ի���� : " + MoneyTwoNum + "��2��Ԫ" + " " + MoneyOneNum + "��1��Ԫ" + " "
						+ MoneyFiftyCentNum + "��50����" + " " + MoneyTwentyCentNum + "��20����" + " " + MoneyTenCentNum
						+ "��10����" + " " + MoneyFiveCentNum + "��5����" + " " + MoneyOneCentNum + "��1����");
			}
			Money = scan.nextFloat();
		}
	}
}
