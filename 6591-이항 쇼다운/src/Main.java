import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long i, a, b, sumA, sum;
        while (true) {
            sumA = 1;
            String temp[] = reader.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            if (a == 0 && b == 0)
                break;
            sum = a - b;
            for (i = a; i > sum; i--) {
                sumA *= i;
                if (sumA % b == 0) {
                    sumA /= b;
                    b--;
                }
            }
            for (i = b; i > 1; i--) {
                sumA /= i;
            }
            writer.write(String.valueOf(sumA));
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }
}
