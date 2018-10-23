import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		int num[], count = 0;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			String string[] = reader.readLine().split(" ");
			avg = count = 0;
			num = new int[Integer.parseInt(string[0])];
			for (int j = 0; j < num.length; j++) {
				num[j] = Integer.parseInt(string[j + 1]);
				avg += num[j];
			}

			avg /= num.length;

			for (int j = 0; j < num.length; j++) {
				if (avg < num[j])
					count++;
			}
			writer.write(String.format("%.3f", count / (double) num.length * 100) + "%\n");
		}

		writer.flush();
		writer.close();

	}
}