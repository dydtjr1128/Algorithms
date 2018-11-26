import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int value[] = new int[n];
        int temp;
        for (int i = 0; i < n; i++)
            value[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (value[i] > value[j]) {
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            writer.write(value[i] + "\n");
        }
        writer.flush();
        writer.close();

    }
}