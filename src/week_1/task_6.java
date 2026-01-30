package week_1;
import java.util.Scanner;

public class task_6 {

	public static void main(String[] args) {
		System.out.println("enter your string: ");
		Scanner scaner = new Scanner(System.in);
		String s = scaner.nextLine();
		
		int left = 0;
		int right = s.length() - 1;
		boolean ispali = true;
		
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)){
				ispali = false;
				break;
			}
			left++;
			right--;
		}
		
		if(ispali) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
