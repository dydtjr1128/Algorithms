import java.io.*;

public class Main {
    private static final int p = (1000000 / 10 * 15);//피사노 주기

    public static long fibo(long n) {
        int fi[] = new int[p];
        if (n <= 1) {
            return n;
        } else {
            fi[0] = 0;
            fi[1] = 1;
            for (int i = 2; i < p; i++) {
                fi[i] = (fi[i - 1] + fi[i - 2]) % 1000000;
            }
        }
        return fi[(int) (n % p)];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(reader.readLine());
        writer.write(String.valueOf(fibo(n)));
        writer.flush();
        writer.close();
    }
}
