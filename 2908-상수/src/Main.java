import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String value[] = reader.readLine().split(" ");
        int a[] = new int[2];
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < 2; j++) {
            for (int i = value[j].length() - 1; i >= 0; i--) {
                builder.append(value[j].charAt(i));
            }
            a[j] = Integer.parseInt(builder.toString());
            builder.setLength(0);
        }

        writer.write((a[0] > a[1] ? a[0] : a[1]) + "");

        writer.flush();
        writer.close();

    }
}