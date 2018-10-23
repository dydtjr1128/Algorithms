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
		int temp = n;
		int count = 0;
		while (true) {
			if (temp < 10)
				temp = temp * 10 + temp;
			else {
				temp = temp % 10 * 10 + ((temp / 10 + temp % 10)%10);
			}			
			count++;
			if (n == temp)
				break;
		}
		writer.write(count + "");
		writer.flush();
		writer.close();

	}
}