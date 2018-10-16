
/*import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num = new Scanner(System.in).nextInt();
		int parent = 1, child = 1, count = 0, temp=0;

		while (true) {	
			parent = 1;
			child = temp+1;
			count++;
			for(int i=0; i<temp; i++) {	
				if(count == num) {
					System.out.println(parent+"/"+child);
					return;
				}
				child--;
				parent++;	
				count++;
			}
			temp++;		
			if(count == num) {
				System.out.println(parent+"/"+child);
				return;
			}
		}
		
	}
}
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num = new Scanner(System.in).nextInt();
		int parent = 1, child = 1, count = 0, temp = 0;

		while (true) {
			
			if (temp % 2 == 1) {
				parent = 1;
				child = temp + 1;
				count++;
				for (int i = 0; i < temp; i++) {
					if (count == num) {
						System.out.println(parent + "/" + child);
						return;
					}
					child--;
					parent++;
					count++;
				}
			}
			else {
				parent = parent+1;
				child = 1;
				count++;
				for (int i = 0; i < temp; i++) {
					if (count == num) {
						System.out.println(parent + "/" + child);
						return;
					}
					child++;
					parent--;
					count++;
				}
			}

			temp++;
			if (count == num) {
				System.out.println(parent + "/" + child);
				return;
			}
		}

	}
}
