import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n[] = new int[8];
        String temp[] = reader.readLine().split(" ");
        for(int i=0; i<n.length; i++)
            n[i] = Integer.parseInt(temp[i]);

        int c=0;
        for(int i=1; i<n.length;i++){
            if(n[i] > n[i-1])
                c++;
        }
        if(c == n.length-1)
            writer.write("ascending");
        else if(c==0)
            writer.write("descending");
        else
            writer.write("mixed");
        writer.flush();
        writer.close();

    }
}
