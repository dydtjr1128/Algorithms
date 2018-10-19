import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		boolean sosu[] = new boolean[1000001];
		int min, max;

		min = S.nextInt();
		max = S.nextInt() + 1;

		Arrays.fill(sosu, true);	
		sosu[0]=false;
		sosu[1]=false;	//1도 소수가 아님
		for (int i = 2; i < max; i++) {
			if (!sosu[i])
				continue;
			else {
				for (int j = i * 2; j < max; j += i) {
					sosu[j] = false;
				}
			}
		}
		for (int i = min; i < max; i++) {
			if (sosu[i]) {
				System.out.println(i);
			}
		}

		S.close();
	}
}