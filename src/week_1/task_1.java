package week_1;
import java.util.Scanner;

public class task_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Say my name: ");
		String name = scanner.nextLine();
		int len = name.length();
		System.out.println("+" + "-".repeat(len) + "+");
		System.out.println("|" + name  + "|");
		System.out.println("+" + "-".repeat(len) + "+");
	}
}