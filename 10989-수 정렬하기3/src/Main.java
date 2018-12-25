import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int array[] = new int[10001];
        int i, j;
        for (i = 0; i < n; i++) {
            array[Integer.parseInt(reader.readLine())]++;
        }
        for (i = 0; i < 10001; i++) {
            if (array[i] != 0) {
                for (j = 0; j < array[i]; j++) {
                    writer.write(String.valueOf(i));
                    writer.newLine();
                }
            }
        }
        writer.flush();
        writer.close();
    }
}
