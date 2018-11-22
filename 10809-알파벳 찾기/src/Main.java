import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int indexes[] = new int['z'-'a'+1];
        Arrays.fill(indexes, -1);

        String value = reader.readLine();

        for (int i = 0; i < value.length(); i++) {
            if (indexes[(int) value.charAt(i) - 'a'] == -1)
                indexes[(int) value.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < indexes.length; i++) {
            writer.write(indexes[i] + " ");
        }
        writer.flush();
        writer.close();

    }
}