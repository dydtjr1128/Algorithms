import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");

        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);

        int result = (int)Math.ceil((V-A)/(double)(A-B)+1);

        reader.close();
        writer.write(String.valueOf(result));
        writer.close();
    }
}
