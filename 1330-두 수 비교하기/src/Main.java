import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String t[] = reader.readLine().split(" ");
        int a = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[1]);
        if (a == b)
            System.out.println("==");
        else
            System.out.println(a > b ? ">" : "<");
    }
}
