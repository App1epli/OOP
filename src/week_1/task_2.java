package week_1;
import java.util.Scanner;

public class task_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length of square: ");
		double a = scanner.nextInt();
		
		
		System.out.println("Area: " + a*a);
		System.out.println("Perimeter: " + 4*a);
		System.out.println("Diagonal: " + Math.sqrt(2) * a);
		
	}

}
