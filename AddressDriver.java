package week4;

public class AddressDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address();
		Address add2 = new Address("�й�","����ʡ","�人��","����ֵ�","40005");
		
		System.out.println("��һ����ַ:");
		add1.displayAddress();
		System.out.println("");
		
		System.out.println("�ڶ�����ַ:");
		add2.displayAddress();
	}

}
