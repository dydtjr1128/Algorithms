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
		String string[] = reader.readLine().split(" ");

		double num[] = new double[n];

		for (int i = 0; i < num.length; i++)
			num[i] = Double.parseDouble(string[i]);

		double temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		double max = num[num.length - 1];
		double avg = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] / (double) max * 100;
			avg += num[i];
		}
		avg /= num.length;
		writer.write(avg + "");
		writer.flush();
		writer.close();

	}
}