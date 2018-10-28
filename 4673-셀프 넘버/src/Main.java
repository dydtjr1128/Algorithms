import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static int d(int n) {
		int temp, value, sum;
		value = n;

		temp = value;
		sum = 0;
		while (temp >= 1) {
			sum += temp % 10;
			temp /= 10;
		}
		value = value + sum;
		return value;

	}

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean isSelfNumber[] = new boolean[10001];
		Arrays.fill(isSelfNumber, true);
		int n;
		for (int i = 1; i < isSelfNumber.length; i++) {
			if (!isSelfNumber[i])
				continue;
			n = i;
			while (n < 10000) {
				n = d(n);
				if (n < isSelfNumber.length - 1)
					isSelfNumber[n] = false;
			}
		}
		for (int i = 1; i < 10000; i++) {
			if (isSelfNumber[i])
				writer.write(i + "\n");
		}

		writer.flush();
		writer.close();

	}
}