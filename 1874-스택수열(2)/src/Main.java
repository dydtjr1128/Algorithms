import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());
        int num, i;
        int stack[] = new int[n];
        int peek = 0, max = 0;
        while (n-- > 0) {
            num = Integer.parseInt(reader.readLine());
            if (num > max) {
                for (i = max + 1; i <= num; i++) {
                    stack[peek++] = i;
                    builder.append("+\n");
                }
                max = num;
            } else if (stack[peek - 1] != num) {
                builder.setLength(0);
                builder.append("NO");
                break;
            }
            peek--;
            builder.append("-\n");
        }
        writer.write(builder.toString());
        writer.flush();
        writer.close();
    }
}
