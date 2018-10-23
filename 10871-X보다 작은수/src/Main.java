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

		String string[] = reader.readLine().split(" ");

		int length = Integer.parseInt(string[0]);
		int X = Integer.parseInt(string[1]);

		String string2[] = reader.readLine().split(" ");
		int num[] = new int[length];
		int value;
		for (int i = 0; i < num.length; i++) {
			value = Integer.parseInt(string2[i]);
			if(value  <X)
				writer.write(value + " ");
		}	
		writer.flush();
		writer.close();

	}
}