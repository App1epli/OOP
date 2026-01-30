package week_1;
import java.util.Scanner;
import java.util.Locale;

public class task_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("What is yo mark: ");
		double mark = scanner.nextDouble();
		
		if(mark < 49.5) {
			System.out.println("F");
		}
		else if(49.5 <= mark && mark< 54.5) {
			System.out.println("D");
		}
		else if(54.5 <= mark && mark< 59.5) {
			System.out.println("D+");
		}
		else if(59.5 <= mark && mark< 64.5) {
			System.out.println("C-");
		}
		else if(64.5 <= mark && mark< 69.5) {
			System.out.println("C");
		}
		else if(69.5 <= mark && mark< 74.5) {
			System.out.println("C+");
		}
		else if(74.5 <= mark && mark< 79.5) {
			System.out.println("B-");
		}
		else if(79.5 <= mark && mark< 84.5) {
			System.out.println("B");
		}
		else if(84.5 <= mark && mark< 89.5) {
			System.out.println("B+");
		}
		else if(89.5 <= mark && mark< 94.5) {
			System.out.println("A-");
		}
		else {
			System.out.println("A");
		}

	}

}
