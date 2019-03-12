import java.io.*;
import java.math.BigInteger;

public class Main {
    private static long combination(int n, int m) {
        int k = n - m;
        long fact = 1;
        long cfact = 1;
        int tmp;
        int division;
        if (m > k) {
            tmp = k;
            for (int i = m + 1; i <= n; i++) {
                fact *= i;
                cfact *= (tmp--);
                if (cfact > 1 && fact % cfact == 0) {
                    fact /= cfact;
                    cfact = 1;
                } else {
                    for (int j = 2; j < k; j++) {
                        if (fact % j == 0 && cfact % j == 0) {
                            fact %= j;
                            cfact %= j;
                            j = 2;
                        }
                    }
                }
            }
        } else {
            tmp = m;
            for (int i = k + 1; i <= n; i++) {
                fact *= i;
                cfact *= (tmp--);

                if (cfact > 1 && fact % cfact == 0) {
                    fact /= cfact;
                    cfact = 1;
                } else {
                    for (int j = 2; j < m; j++) {
                        if (fact % j == 0 && cfact % j == 0) {
                            fact /= j;
                            cfact /= j;
                            j = 2;
                        }
                    }
                }
            }
        }
        return fact;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        BigInteger[][] arr = new BigInteger[101][101];
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                arr[i][j] = new BigInteger("0");
            }
        }
        BigInteger big = new BigInteger("1");
        arr[0][0] = arr[1][0] = arr[1][1] = big;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == n)//삼각형 양끝
                    arr[i][j] = big;
                else {
                    arr[i][j] = arr[i - 1][j].add(arr[i - 1][j - 1]);
                }
                if (i == n && j == m)
                    break;
            }
        }
        writer.write(arr[n][m].toString());

        writer.flush();
        writer.close();
    }


}
