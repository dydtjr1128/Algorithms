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
		boolean isWrite;
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(reader.readLine());
			isWrite = false;
			for (int j = a / 2; j >= 2; j--) {
				if(isWrite) break;
				else if (isPrime[j]) {
					for (int k = a / 2; k < a; k++) {
						if (isPrime[k] && j + k == a) {
							writer.write(j + " " + k + "\n");							
							isWrite=true;
							break;			
						}
					}
				}
			}		
		}
		writer.flush();
		writer.close();

	}
}