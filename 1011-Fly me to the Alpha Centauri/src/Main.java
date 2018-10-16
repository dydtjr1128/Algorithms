import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			int val = y - x;

			int m = (int) Math.sqrt(val);
			int temp = (int) (val - Math.pow(m, 2));		
		
			if(temp == 0) {
				m=m*2-1;
			}
			else if (temp <= m) {
				m=m*2;
							
			}			
			else {
				m=m*2+1;				
			}
			System.out.println(m);
		}
	}
}