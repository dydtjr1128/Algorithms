import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int W, H, N, num;
		try {
			num = Integer.parseInt(reader.readLine());
			for (int i = 0; i < num; i++) {
				String read[] = reader.readLine().split(" ");
				H = Integer.parseInt(read[0]);
				W = Integer.parseInt(read[1]);
				N = Integer.parseInt(read[2]);
				
				int q = N/H+1;//¸ò
				int r = N%H;//³ª¸ÓÁö
				if(r==0) {
					r = H;
					q--;
				}
			
				String value = r + ((q>9)?"":"0") + q;
				
				//System.out.println(N + " " + r + " " + q +" " + value);
				System.out.println(value);

			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}