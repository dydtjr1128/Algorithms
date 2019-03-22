import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 9;
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            sum += array[i];
        }
        boolean isFind = false;
        for (int i = 0; i < n && !isFind; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sum - array[i] - array[j] == 100) {
                    array[i] = -1;
                    array[j] = -1;
                    isFind = true;
                    break;
                }
            }
        }
        Arrays.sort(array);
        for (int i = 2; i < n; i++) {
            writer.write(String.valueOf(array[i]));
            writer.newLine();

        }

        writer.flush();
        writer.close();
    }
}

