
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num, M, N, x, y, count;
		try {
			num = Integer.parseInt(reader.readLine());
			for (int i = 0; i < num; i++) {
				String read[] = reader.readLine().split(" ");
				M = Integer.parseInt(read[0]);
				N = Integer.parseInt(read[1]);
				x = Integer.parseInt(read[2]);
				y = Integer.parseInt(read[3]);
				
				count = 0;
				int xt = 0, yt = 0;
				if(x-y!=0 && M-N !=0 &&(Math.abs(x-y)%Math.abs(M-N)!=0) && (Math.abs(x-y)>Math.abs(M-N))){
					System.out.println("-1");
					continue;
				}
				while (true) {
					xt++;
					yt++;
					count++;
					if (xt == M)
						xt = 0;
					if (yt == N)
						yt = 0;
					//System.out.println(xt + " " + yt);
					if (xt == x && yt == y) {
						System.out.println(count);
						break;
					}
				}

			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
*/
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

				int xt = 0, yt = 0;
				int count = 0;
				
				int max = (M < N)? M : N;//최소공배수
				int Ntemp = N;
				int Mtemp = M;
				int Xtemp=1;
				int j=2;
				while(true) {
					if(Ntemp%j==0 && Mtemp%j==0) {
						Xtemp*=j;
						Mtemp/=j;
						Ntemp/=j;					
						j=1;
					}
					if(j==Ntemp || j==Mtemp || Ntemp==1 || Mtemp==1) {
						break;
					}
					j++;
				}
				max = Xtemp * Ntemp * Mtemp;
				//System.out.println("최대공약수  : " + max + " " + Xtemp + " "  + Ntemp + " " + Mtemp);
				
				
				while (true) {
					xt++;
					yt++;
					if(xt == M+1)
						xt = 1;
					if(yt == N+1)
						yt = 1;
					count++;
					
					//System.out.println("< "+xt+":"+yt+" > " + count);
					System.out.println(M + " " + N + " " + xt + " " + yt);
					if(xt == x && yt == y) {
						System.out.println(count);
						break;
					}
					if(count >max) {
						System.out.println(-1);
						break;
					}
				}

			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}