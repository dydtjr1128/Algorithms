import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] s = reader.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        if (b >= 45) {
            System.out.println(a + " " + (b - 45));
        } else {
            System.out.println((a == 0 ? 23 : (a - 1)) + " " + (60 - (45 - b)));
        }

    }
}
