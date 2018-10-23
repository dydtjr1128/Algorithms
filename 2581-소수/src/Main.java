import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean isPrime[] = new boolean[10001];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; i++) {
			if (!isPrime[i])
				continue;

			for (int j = i * 2; j < isPrime.length; j += i) {
				isPrime[j] = false;
			}
		}

		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int count = 0;
		int min = b;
		for (int i = a; i <= b; i++) {
			if (isPrime[i]) {
				count += i;
				if (min > i)
					min = i;
			}
		}
		if (count == 0)
			System.out.println(-1);
		else {
			writer.write(count + "\n");
			writer.write(min + "");
		}
		writer.flush();
		writer.close();

	}
}