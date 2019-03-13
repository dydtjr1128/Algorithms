import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(reader.readLine());
        String temp = reader.readLine();
        boolean state[] = new boolean[n + 2];
        int len = n * 2 - 1;
        for (int i = 0; i < len; i++) {
            state[count++] = temp.charAt(i) == '1';
            i++;
        }
        state[n] = state[n + 1] = false;
        count = 0;

        for (int i = 0; i < n; i++) {
            if (state[i]) {
                state[i + 1] = !state[i + 1];
                state[i + 2] = !state[i + 2];
                count++;
            }
        }
        System.out.println(count);
    }
}