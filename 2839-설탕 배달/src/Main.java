import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		int big, small, temp, val = -1;
		temp = N % 5;
		if (temp == 0) {
			System.out.println(N / 5);
		} else if (temp % 3 == 0) {
			System.out.println(N / 5 + temp / 3);
		} else {
			for (int i = 0; i <= 1000; i++) {
				big = 5 * i;
				temp = 1;
				if (big > N)
					break;
				while (true) {
					small = 3 * temp++;
					if (big + small == N) {
						val = i + temp - 1;
					} else if (big + small > N)
						break;
				}
			}
			System.out.println(val);
		}
		S.close();

	}
}