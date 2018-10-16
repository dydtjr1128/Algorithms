import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num = new Scanner(System.in).nextInt();
		int end = 7, start = 2, count = 1,temp = 6;
		if(num==1) {
			System.out.println(1);
			return;
		}
		while (true) {
			if (num >= start && num <= end) {
				System.out.println(++count);
				break;
			} else {
				temp+=6;
				start = end+1;
				end += temp;
				count++;				
			}
		}

	}
}
