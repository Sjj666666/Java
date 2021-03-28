package week4;

public class AddressDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address();
		Address add2 = new Address("中国","湖北省","武汉市","阳光街道","40005");
		
		System.out.println("第一个地址:");
		add1.displayAddress();
		System.out.println("");
		
		System.out.println("第二个地址:");
		add2.displayAddress();
	}

}
