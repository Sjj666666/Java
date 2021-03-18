package week3;

import java.util.Scanner;

public class 换钱 {
	public static void main(String args[]) {
		// 定义常量
		final int FIVECENT = 5;
		final int TENCENT = 10;
		final int TWENTYCENT = 20;
		final int FIFTYCENT = 50;
		final int MONEYTWO = 2;

		// 定义变量
		float Money; // 输入金额
		int MoneyZheng = 0; // 金额的整数部分
		int MoneyXiaoShu = 0; // 金额小数部分

		int MoneyOneNum = 0; // 换多少个1美元
		int MoneyTwoNum = 0; // 换多少个2美元
		int MoneyOneCentNum = 0; // 换多少个1美分
		int MoneyFiveCentNum = 0; // 换多少个5美分
		int MoneyTenCentNum = 0; // 换多少个10美分
		int MoneyTwentyCentNum = 0; // 换多少个20美分
		int MoneyFiftyCentNum = 0; // 换多少个50美分

		// 数据输入
		System.out.println("请输入金额(输入-1结束程序)：");
		Scanner scan = new Scanner(System.in);
		Money = scan.nextFloat();

		// 数据处理+数据输出
		while (Money != -1) {
			if (Money == 0) {
				System.out.println("输入无效，请输入大于0的正确金额！");
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
				System.out.println("您的" + Money + "美元可以换算成 : " + MoneyTwoNum + "个2美元" + " " + MoneyOneNum + "个1美元" + " "
						+ MoneyFiftyCentNum + "个50美分" + " " + MoneyTwentyCentNum + "个20美分" + " " + MoneyTenCentNum
						+ "个10美分" + " " + MoneyFiveCentNum + "个5美分" + " " + MoneyOneCentNum + "个1美分");
			}
			Money = scan.nextFloat();
		}
	}
}
