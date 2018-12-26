import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        int[][] dp = new int[1001][1001];
        //페르마의 소정리 써야한다는데 아직 못품

        writer.write(String.valueOf(dp[n][k]));
        writer.flush();
        writer.close();
    }
}