
/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void drawCaseStar(int n) {
		
	}
	public static void drawStar(int n) {
		try {
			int p = 5, q = 5;
			for (int i = 0; i < n; i++) {

				for (int j = 0; j < n - i - 1; j++) {
					writer.write(" ");
				}
				switch (i % 6) {
				case 0:
					writer.write("*");
					break;
				case 1:
					writer.write("* *");
					break;
				case 2:
					writer.write("*****");
					break;
				case 3:case 4:case 5:
					switch (i % 3) {
					case 0:
						writer.write("*");
						break;
					case 1:
						writer.write("* *");
						break;
					case 2:
						writer.write("*****");
						break;
					}
					for (int j = 0; j < q; j++) {
						writer.write(" ");
					}
					q -= 2;
					if (q == 0) {
						p *= 2;
						p++;
						q = p;
					}
					switch (i % 3) {
					case 0:
						writer.write("*");
						break;
					case 1:
						writer.write("* *");
						break;
					case 2:
						writer.write("*****");
						break;
					}

				}
			
				writer.write("\n");
				// writer.write("*\n* *\n*****\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = Integer.parseInt(reader.readLine());
		drawStar(n);
		writer.flush();
		writer.close();

	}
}
//3*2 = 6
//3*4 = 12
//3*8 = 24
//3*16 = 48*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void drawCaseStar(int n) {

	}

	public static void drawStar(int n) {
		try {
			int p = 2, q = 2;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - i - 1; j++) {
					writer.write(" ");
				}
				switch (i % 3) {
				case 0:
					writer.write("*");
					break;
				case 1:
					writer.write("* *");
					break;
				case 2:
					writer.write("*****");
					break;
				}
				p = p*2+1;
				
				//writer.write("\n");
				// writer.write("*\n* *\n*****\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		int n = Integer.parseInt(reader.readLine());
		drawStar(n);
		writer.flush();
		writer.close();

	}
}