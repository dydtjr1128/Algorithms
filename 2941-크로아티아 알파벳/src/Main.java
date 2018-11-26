import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String value = reader.readLine();

        value = value.replaceAll("c=", "1").replaceAll("c-", "1").
                replaceAll("dz=", "1").replaceAll("d-", "1")
                .replaceAll("lj", "1").replaceAll("nj", "1")
                .replaceAll("s=", "1").replaceAll("z=", "1");


        writer.write(value.length() + "");

        writer.flush();
        writer.close();

    }
}