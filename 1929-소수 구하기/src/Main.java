import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean sosu[] = new boolean[1000001];
        int min, max;
        String temp[] = reader.readLine().split(" ");
        min = Integer.parseInt(temp[0]);
        max = Integer.parseInt(temp[1]) + 1;

        Arrays.fill(sosu, true);
        sosu[0] = false;
        sosu[1] = false;    //1도 소수가 아님
        for (int i = 2; i < max; i++) {
            if (!sosu[i])
                continue;
            else {
                for (int j = i * 2; j < max; j += i) {
                    sosu[j] = false;
                }
            }
        }
        for (int i = min; i < max; i++) {
            if (sosu[i]) {
                writer.write(String.valueOf(i));
                writer.newLine();
            }
        }

        writer.flush();
        writer.close();
    }
}