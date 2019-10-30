import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int a = Integer.parseInt(s1);
        int result = 0;

        for (int i = 2; i >= 0; i--) {
            int t = a * (s2.charAt(i) - '0');
            result += (Math.pow(10, 2 - i) * t);
            System.out.println(t);
        }
        System.out.println(result);
        reader.close();
    }
}
