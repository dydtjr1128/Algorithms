import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		ArrayList<Integer> sosuList = new ArrayList<>();
		int sosuCount;
		for(int i=2; i<123456*2+1; i++) {
			sosuCount = 0;			
			for(int j=2; j<i/2+1; j++) {
				if(i%j==0) {						
					sosuCount++;
					break;
				}
			}
			if(sosuCount==0) {
				sosuList.add(i);
			}
		}
		int num, max, dapCount, temp;
		while(true) {
			num = S.nextInt();			
			if(num==0)
				break;
			max = num*2;
			dapCount=0;			
			for(int i=0; i<sosuList.size(); i++) {
				temp = sosuList.get(i);
				if(temp > num && temp <= max) {
					dapCount++;
				}
				
			}
			System.out.println(dapCount);
		}
		S.close();
	}
}