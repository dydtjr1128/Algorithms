import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        int c = 1, t = 0;
        int num[] = new int[n];
        int stack[] = new int[n + 1];
        int peek = 0;
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        stack[peek] = -1;
        boolean isExist = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            while (c <= num[i]) {
                stack[peek] = c;
                peek++;
                c++;
                builder.append("+\n");
            }
            isExist = false;
            for (int j = 0; j <= peek + 1; j++) {
                if (num[i] == stack[j]) {
                    isExist = true;
                    break;
                }
            }
            if (isExist == false) {
                writer.write("NO\n");
                writer.flush();
                writer.close();
                return;
            }
            while (peek > 0 && stack[peek - 1] >= num[i]) {
                stack[peek] = 0;
                peek--;
                builder.append("-\n");
            }
            //writer.write(temp+ " " + c + "\n");
        }
        writer.write(builder.toString());
        writer.flush();
        writer.close();

    }
}
