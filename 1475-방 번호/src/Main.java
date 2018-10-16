import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num = new Scanner(System.in).nextInt();
		int numCount[] = new int[10];
		int count = 0;
		int maxCount = 0;
		Arrays.fill(numCount, 0);

		if (num == 0)
			numCount[0] = 1;
		else {
			while (num > 0) {
				numCount[num % 10]++;
				num /= 10;
			}
		}
		for (int i = 0; i < 10; i++)
			System.out.println(i + " : " + numCount[i]);
		maxCount = numCount[0];
		for (int i = 1; i < 10; i++) {
			if (i == 6 || i == 9)
				continue;
			if (numCount[i] > maxCount)
				maxCount = numCount[i];
		}
		count = numCount[6] + numCount[9];
		count = count / 2 + count % 2;

		if (count < maxCount) {
			System.out.println(maxCount);
		} else {
			System.out.println(count);
		}
	}
}
