import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        int psum = 1, csum = 1;
        double val;
        for (int i = 0; i < k; i++) {
            psum *= (n - i);
        }
        for (int i = 0; i < k; i++) {
            csum *= (k - i);
        }
        val = psum / csum;
        writer.write(String.valueOf(val));
        writer.flush();
        writer.close();
    }
}
