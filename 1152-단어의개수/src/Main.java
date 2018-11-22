import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String value = reader.readLine();
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ' ')
                count++;
        }
        if(value.charAt(0) == ' ')
            count--;
        if(value.charAt(value.length()-1) == ' ')
            count--;


        writer.write(++count + "");
        writer.flush();
        writer.close();
    }
}
