import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String temp = S.nextLine();
		int length = temp.length();
		int index = 0;
		for (int i = 0; i < length / 10; i++) {
			System.out.println(temp.substring(index, index + 10));
			index += 10;
		}
		System.out.println(temp.substring(index, length));

		/*
		 * while (true) { if (index+10 >= length) {
		 * System.out.println(temp.substring(index, length)); break; } else
		 * System.out.println(temp.substring(index, index + 10)); index += 10; }
		 */
		S.close();

	}
}