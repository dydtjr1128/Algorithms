import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int calc(int i) {
        return i * (i + 1) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int i = 1;
        int v = 0;
        while (true) {
            v = calc(i);
            if (v >= n) {
                v = calc(i - 1);
                break;
            } else {
                i++;
            }
        }
        v = n - v - 1;

        if (i % 2 == 0) {
            System.out.println((1 + v) + "/" + (i - v));
        } else {
            System.out.println((i - v) + "/" + (1 + v));
        }

    }
}
