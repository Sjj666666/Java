package week3;

import java.util.Scanner;

public class 相框 {
	public static void main(String args[]) {
		// 定义常量
		final float COLORINGMONEY = 0.10f;// 上色价格
		final float REGULARMONEY = 0.15f;// 普通相框价格
		final float FANCYMONEY = 0.25f;// 精美相框价格
		final float CARDBOARDMONEY = 0.02f;// 放硬纸板价格
		final float GLASSMONEY = 0.07f;// 放玻璃价格
		final float CROWNSMONEY = 0.35f;// 王冠价格

		// 定义变量
		float Length = 0; // 长度
		float Width = 0; // 宽度
		int FrameType = 0; // 相框类型
		int IfColoring = 0; // 是否上色
		int IfCrown = 0; // 是否安置王冠
		float CrownNumber = 0; // 王冠数量

		float AllMoney = 0; // 总价格
		float FrameMoney = 0; // 相框价格
		float ColoringMoney = 0;// 上色价格
		float CrownMoney = 0; // 王冠价格
		float PutMoney = 0;// 为图片放硬纸板或者玻璃的价格

		// 数据输入
		System.out.println("请输入图片的长度和宽度，单位为英寸:");
		Scanner scan = new Scanner(System.in);
		Length = scan.nextFloat();
		Width = scan.nextFloat();

		System.out.println("请输入相框的类型：");
		System.out.println("1.普通相框      0.精美相框");
		FrameType = scan.nextInt();

		System.out.println("请输入是否为相框上色：");
		System.out.println("1.Yes      0.No");
		IfColoring = scan.nextInt();

		System.out.println("请输入是否放置王冠：");
		System.out.println("1.Yes      0.No");
		IfCrown = scan.nextInt();
		if (IfCrown == 1) {
			System.out.println("请输入放置王冠的个数(最大为4)：");
			CrownNumber = scan.nextFloat();
		}

		// 处理数据
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

		// 输出数据
		AllMoney = FrameMoney + PutMoney + ColoringMoney + CrownMoney;
		System.out.println("总价格为：" + AllMoney + "美元");
	}
}
