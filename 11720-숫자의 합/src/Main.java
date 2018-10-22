import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		String temp = S.next();
		int val = 0;
		for (int i = 0; i < n; i++) {
			val += (temp.charAt(i)-'0');			
		}
		System.out.println(val);
		S.close();

	}
}