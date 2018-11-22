import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String temp[] = reader.readLine().split(" ");
            for (int j = 0; j < temp[1].length(); j++) {
                for (int q = 0; q < Integer.parseInt(temp[0]); q++) {
                    writer.write(temp[1].charAt(j));
                }
            }
            writer.write("\n");

        }
        writer.flush();
        writer.close();

    }
}