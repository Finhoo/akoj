import java.util.Scanner;

public class P1199 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt();
			if (a ==0 && b == 0) break;
			System.out.println(a + b);
		}
		cin.close();
	}
}
