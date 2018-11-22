import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        short count[] = new short[10];
        Arrays.fill(count,(short)0);

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int t = a * b * c;

        while(t>0){
            count[t%10]++;
            t/=10;
        }
        for(int i=0; i<count.length; i++)
            writer.write(count[i]+"\n");
        writer.flush();
        writer.close();

    }
}
