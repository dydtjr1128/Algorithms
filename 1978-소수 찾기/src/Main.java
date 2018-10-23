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

		boolean isPrime[] = new boolean[1001];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; i++) {
			if (!isPrime[i])
				continue;

			for (int j = i * 2; j < isPrime.length; j += i) {
				isPrime[j] = false;
			}
		}

		int n = Integer.parseInt(reader.readLine());
		String temp[] = reader.readLine().split(" ");
		int count = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(temp[i]);
			if(isPrime[a])
				count++;
		}
		writer.write(count + "");
		writer.flush();
		writer.close();

	}
}