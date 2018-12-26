import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci2(int n) {
        int sum = 0;
        if (n == 0) {
            sum = n;
        } else if (n == 1) {
            sum = n;
        } else {
            int temp1 = 1, temp2 = 0;
            for (int i = 0; i < n - 1; i++) {
                sum = temp1 + temp2;
                temp2 = temp1;
                temp1 = sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        final int TEST_NUM = 45;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(TEST_NUM + "th fibonacci number.\n");
        writer.write("Fibonacci recursion start!!\n");
        long st = System.nanoTime();
        for (int i = 0; i < TEST_NUM; i++) {
            fibonacci(i);
        }
        writer.write(String.format("%.5fms", (System.nanoTime() - st) / (double) 1000000));
        writer.newLine();
        writer.flush();

        writer.write("Fibonacci for-loop start!!\n");
        st = System.nanoTime();
        for (int i = 0; i < TEST_NUM; i++) {
            fibonacci2(i);
        }
        writer.write(String.format("%.5fms", (System.nanoTime() - st) / (double) 1000000));
        writer.newLine();

        writer.flush();
        writer.close();
    }
}
