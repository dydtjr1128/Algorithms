import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
