import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			temp += i;
		}
		System.out.println(temp);
		S.close();

	}
}