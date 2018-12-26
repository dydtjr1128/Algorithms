import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int val = (n / 5) + (n / 25) + (n / 125);//2,5한세트마다 뒤의 0이 늘어나므로 5의개수만 새면된다.
        writer.write(String.valueOf(val));
        writer.flush();
        writer.close();

    }
}