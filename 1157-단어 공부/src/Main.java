import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count[] = new int['Z'-'A'+1];
        String value = reader.readLine();

        Arrays.fill(count,0);
        for(int i=0; i<value.length(); i++)
            count[Character.toUpperCase(value.charAt(i))-'A']++;
        int max = 0;
        int maxIndex = 0;
        for(int i=0; i<count.length; i++){
            if(max < count[i]) {
                max = count[i];
                maxIndex = i;
            }
        }
        for(int i=0; i<count.length; i++){
            if(i != maxIndex && max == count[i]){
                writer.write("?");
                writer.flush();
                writer.close();
                return;
            }
        }
        writer.write((char)(maxIndex+'A'));

        writer.flush();
        writer.close();

    }
}