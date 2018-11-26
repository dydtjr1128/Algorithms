import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int keyMap[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        int sum = 0;

        String value = reader.readLine();

        for (int i = 0; i < value.length(); i++) {
            sum += keyMap[value.charAt(i)-'A'];
        }

        writer.write(sum + value.length() + "");

        writer.flush();
        writer.close();

    }
}