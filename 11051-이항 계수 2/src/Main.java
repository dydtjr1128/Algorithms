import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        int[][] dp = new int[1001][1001];
        //이항계수 = 파스칼의 삼각형 이용
        dp[0][0] = dp[1][0] = dp[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == n)//삼각형 양끝
                    dp[i][j] = 1;
                else
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % 10007;
                if (i == n && j == k)
                    break;
            }
        }
        writer.write(String.valueOf(dp[n][k]));
        writer.flush();
        writer.close();
    }
}