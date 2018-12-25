import java.io.*;

public class Main {
    public static int[] fibonacci(int n) {
        int[] fiboArray = new int[n + 1];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        int sum;
        if (n > 1) {
            int temp1 = 1, temp2 = 0;
            for (int i = 2; i < n + 1; i++) {
                sum = temp1 + temp2;
                fiboArray[i] = sum;
                temp2 = temp1;
                temp1 = sum;
            }
        }
        return fiboArray;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int array[] = new int[n];
        int i;
        int max = 0;
        for (i = 0; i < n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (max < array[i])
                max = array[i];
        }
        int[] fibo = fibonacci(max);
        for (i = 0; i < n; i++) {
            if (array[i] == 0) {
                writer.write(String.valueOf(1));
                writer.write(" ");
                writer.write(String.valueOf(0));
            } else {
                writer.write(String.valueOf(fibo[array[i] - 1]));
                writer.write(" ");
                writer.write(String.valueOf(fibo[array[i]]));
            }
            writer.newLine();
        }

        writer.flush();
        writer.close();
    }
}
