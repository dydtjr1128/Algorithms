import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    private static int zeroCount = 0;
    private static int oneCount = 0;
    private static int array[] = new int[41];
    private static int array2[] = new int[41];

    public static int fibonacci(int n) {
        if (n == 0) {
            zeroCount++;
            return 0;
        } else if (n == 1) {
            oneCount++;
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci2(int n) {
        int sum = 0;
        if (n == 0) {
            zeroCount++;
            sum = n;
        } else if (n == 1) {
            oneCount++;
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
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("Fibonacci Recursion start!!\n");
        long st = System.nanoTime();
        for (int i = 0; i < 45; i++) {
            fibonacci(i);
            zeroCount = oneCount = 0;
        }
        writer.write(String.format("%.5fms", (System.nanoTime() - st) / (double) 1000000));
        writer.newLine();
        writer.flush();

        writer.write("Fibonacci For loop start!!\n");
        st = System.nanoTime();
        for (int i = 0; i < 45; i++) {
            fibonacci2(i);
            zeroCount = oneCount = 0;
        }
        writer.write(String.format("%.5fms", (System.nanoTime() - st) / (double) 1000000));
        writer.newLine();

        writer.flush();
        writer.close();
    }
}
