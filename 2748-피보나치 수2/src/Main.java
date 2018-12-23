import java.io.*;

public class Main {
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(fibonacci(90)));
        writer.newLine();

        writer.flush();
        writer.close();
    }
}
