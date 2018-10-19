import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final int MAX_NUM = 123456 * 2 + 1;

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		boolean sosu[] = new boolean[MAX_NUM];
		
		Arrays.fill(sosu, true);
		for (int i = 2; i < MAX_NUM; i++) {
			if (!sosu[i])
				continue;
			else {
				for (int j = i*2 ; j < MAX_NUM; j += i) {
					sosu[j] = false;
				}
			}
		}		
		int num, max, dapCount;
		while (true) {
			num = S.nextInt();
			if (num == 0)
				break;
			max = num * 2;
			dapCount = 0;
			for (int i = num+1; i <=max; i++) {				
				if (sosu[i]) {
					dapCount++;
				}
			}
			System.out.println(dapCount);
		}
		S.close();
	}
}