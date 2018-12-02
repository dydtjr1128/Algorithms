import java.io.*;

public class Main {

    public static int calc(int a, int b) {
        if (b == 0) return a;
        return calc(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String value[] = reader.readLine().split(" ");
            int a = Integer.parseInt(value[0]);
            int b = Integer.parseInt(value[1]);
            int c = calc(a, b);
            writer.write(a * b / c + "\n");
        }
        writer.flush();
        writer.close();
    }
}