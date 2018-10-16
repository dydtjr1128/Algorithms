import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num, M, N, x, y;
		try {
			num = Integer.parseInt(reader.readLine());
			for (int i = 0; i < num; i++) {
				String read[] = reader.readLine().split(" ");
				M = Integer.parseInt(read[0]);
				N = Integer.parseInt(read[1]);
				x = Integer.parseInt(read[2]);
				y = Integer.parseInt(read[3]);
				int xt, yt;
				int count = 0;
				boolean success = true;

				int max = (M < N) ? M : N;// 최대공약수
				int Ntemp = N;
				int Mtemp = M;
				int Xtemp = 1;
				int j = 2;
				while (true) {
					if (Ntemp % j == 0 && Mtemp % j == 0) {
						Xtemp *= j;
						Mtemp /= j;
						Ntemp /= j;
						j = 1;
					}
					if (j == Ntemp || j == Mtemp || Ntemp == 1 || Mtemp == 1) {
						break;
					}
					j++;
				}
				max = Xtemp * Ntemp * Mtemp;

				xt = x;
				yt = (N < xt) ? xt % N : xt;
				count = xt;

				if (yt == 0)
					yt = N;
				if (xt == x && yt == y) {
					System.out.println(count);
					continue;
				}
				while (true) {
					yt = (yt + M) % N;
					count += M;
					if (yt == 0)
						yt = N;
					if (yt == y) {
						System.out.println(count);
						break;
					}
					else if (count > max) {
						System.out.println("-1");
						success = false;
						break;
					}
				}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}