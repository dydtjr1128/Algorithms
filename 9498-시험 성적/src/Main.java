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

		int n = Integer.parseInt(reader.readLine());

		if (n >= 90 && n <= 100)
			writer.write("A");
		else if (n >= 80 && n <= 89)
			writer.write("B");
		else if (n >= 70 && n <= 79)
			writer.write("C");
		else if (n >= 60 && n <= 69)
			writer.write("D");
		else
			writer.write("F");		
		writer.flush();
		writer.close();

	}
}