import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(i+1);
		}	
		S.close();

	}
}