package week4;

public class DogDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("С��", "��ɫ", 2);
		
		System.out.println("��һֻС����");
		dog1.displayAge();
		
		System.out.println("");
		
		System.out.println("�ڶ�ֻС����");
		dog2.displayAge();

	}

}
