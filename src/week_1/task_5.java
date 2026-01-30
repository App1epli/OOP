package week_1;
import java.util.Scanner;
public class task_5 {

	public static void main(String[] args) {
		int balance = 0;
		System.out.println("Your current balance is: " + balance);
		System.out.println("Please enter your money: ");
		
		Scanner scaner = new Scanner(System.in);
		
		int money = scaner.nextInt();
		balance += money;
		
		System.out.println("You inserted" + money + "KZT, Your curent balance is " + balance);
		
	}

}
