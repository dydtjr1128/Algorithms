import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean isSelfNumber[] = new boolean[10001];
		int value, temp, sum;
		Arrays.fill(isSelfNumber, true);
		for (int i = 1; i < isSelfNumber.length; i++) {
			if (!isSelfNumber[i])
				continue;
			value = i;
			while (value < 10000) {
				temp = value;
				sum = 0;
				while (temp >= 1) {
					sum += temp % 10;
					temp /= 10;
				}
				value = value + sum;
				if (value < isSelfNumber.length - 1)
					isSelfNumber[value] = false;
			}

		}
		for (int i = 1; i < 10000; i++) {
			if (isSelfNumber[i])
				writer.write(i+"\n");
		}

		writer.flush();
		writer.close();

	}
}