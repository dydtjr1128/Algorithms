import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a = S.nextInt();
		int b = S.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		S.close();
	}
}