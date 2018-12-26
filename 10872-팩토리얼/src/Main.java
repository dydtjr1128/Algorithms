import java.io.*;

public class Main {
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);

        writer.write(String.valueOf(factorial(n)));
        writer.flush();
        writer.close();
    }
}