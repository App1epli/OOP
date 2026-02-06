package week_2;
import java.util.Scanner;

public class StarTriangle {
	private int count;
	
	public StarTriangle(int cnt) {
		this.count = cnt;
	}
	
	public String toString() {
		StringBuilder StB = new StringBuilder();
		for(int i = 0; i<count; i++) {
			for (int j = 0; j<=i; j++) {
				StB.append("[*]");
			}
			StB.append("\n");
			
		}
		return StB.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cvnt = scanner.nextInt();
		StarTriangle tri = new StarTriangle(cvnt);
		System.out.println(tri.toString());
	}
}
