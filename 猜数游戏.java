package week3;

import java.util.Scanner;

public class ²ÂÊýÓÎÏ· {

	public static void main(String[] args) {
		String again = null;
		int i=0;
		
		do {
			int randomNumber;
			int guessNumber;
			randomNumber = (int)(Math.random()*1000+1);
			System.out.println(randomNumber);
			
			System.out.println("I have a number between 1 and 1000.");
			System.out.println("Can you guess my number?");
			System.out.println("Please type your first guess.");
			
			Scanner scan = new Scanner(System.in);
			guessNumber = scan.nextInt();
			for(i = 9; i>0 ;i--) {
				if( guessNumber > randomNumber ) {
					System.out.println("Too High.Try Again.");
					System.out.println("You have left "+i+" times!");
				}
				if( guessNumber < randomNumber) {
					System.out.println("Too Low.Try Again.");
					System.out.println("You have left "+i+" times!");
				}
				if( guessNumber == randomNumber) {
					System.out.println("Excellent!You guessed the number.");
					break;
				}
				guessNumber = scan.nextInt();
			}
			if(i==0) {
				System.out.println("Sorry,you fail.");
			}
			System.out.println("Do you want play again? Y/N ");
			again = scan.next();
		}while(again.equalsIgnoreCase("y"));
	}

}
