import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine());
		int count = 99, temp, length = 0, value, valueTemp, num;
		boolean isNum = false;

		if (n >= 100) {
			temp = n;
			while (temp > 0) {
				temp /= 10;
				length++;
			}
			for (int i = 2; i < length; i++) {
				for (int j = 1; j < 10; j++) {
					for (int q = 0; q < 10; q++) {
						value = j;
						valueTemp = q;
						isNum = true;
						num = j;
						for (int k = 0; k < i; k++) {
							value += valueTemp;
							num *= 10;
							num += value;
							if (value >= 10) {
								isNum = false;
								break;
							}
						}
						if (isNum && num <= n) {
							count++;
							//System.out.println(num);
						}
					}
					for (int q = 1; q < 10; q++) {
						value = j;
						valueTemp = q;
						isNum = true;
						num = j;
						for (int k = 0; k < i; k++) {
							value -= valueTemp;
							num *= 10;
							num += value;
							if (value < 0) {
								isNum = false;
								break;
							}
						}
						if (isNum && num <= n) {
							count++;
							//System.out.println(num);
						}
					}

				}
			}
		}
		else {
			count = n;
		}

		writer.write(count + "");
		writer.flush();
		writer.close();

	}
}
//111 123 135 147 159 234 210