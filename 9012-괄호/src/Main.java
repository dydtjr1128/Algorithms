import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        String text;
        char stack[], temp;
        int i, peek, len;
        boolean isRight;
        while (n-- > 0) {
            text = reader.readLine();
            len = text.length();
            stack = new char[len];
            peek = 0;
            isRight = true;
            for (i = 0; i < len; i++) {
                temp = text.charAt(i);
                if (temp == '(') {
                    stack[peek++] = temp;
                } else if (temp == ')') {
                    peek--;
                }

                if (peek < 0 || peek >= len) {
                    isRight = false;
                    break;
                }
            }
            if (isRight && peek == 0) {
                writer.write("YES\n");
            } else {
                writer.write("NO\n");
            }
        }
        writer.flush();
        writer.close();
    }
}
