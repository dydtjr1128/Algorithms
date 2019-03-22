import java.io.*;
import java.util.ArrayList;

public class Main {
    public static boolean isDownNumber(long n) {
        long t = n % 10;
        n /= 10;
        while (n >= 1) {
            if (t >= n % 10)
                return false;
            t = n % 10;
            n /= 10;
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        //int array
        for (int i = 0; i < 10 && i < n; i++) {
            arrayList.add(i);
        }
        while (true) {
            int num = 10;
            int t, len;
            for (int i = 1; i < 7; i++) {//2자리 수부터 7자리까지
                num = (int) Math.pow(10, i);
                for (int j = i; j < 10; j++) {
                    for (int q = 0; q < i; q++) {
                        t = num*j;
                        len = j;
                        for (int k = 0; k <q ; k++) {

                        }
                        for (int k = 0; k < len; k++) {
                            arrayList.add(t + k);
                        }
                    }
                }
            }
            break;
        }

        writer.write(String.valueOf(5));
        writer.flush();
        writer.close();
    }
}

