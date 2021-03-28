package week4;

public class DogDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("小黄", "黄色", 2);
		
		System.out.println("第一只小狗：");
		dog1.displayAge();
		
		System.out.println("");
		
		System.out.println("第二只小狗：");
		dog2.displayAge();

	}

}
