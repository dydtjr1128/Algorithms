import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(reader.readLine());
            sum += (n < 40) ? 40 : n;
        }
        writer.write((sum / 5) + "");
        writer.flush();
        writer.close();

    }
}