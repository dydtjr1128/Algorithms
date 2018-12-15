import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = reader.readLine();
        int len = text.length();
        char stack[] = new char[len];
        int peek = 0;
        char temp;
        int sum = 0, val = 1;
        for (int i = 0; i < len; i++) {
            temp = text.charAt(i);
            switch (temp) {
                case '(':
                    val *= 2;
                    stack[peek++] = temp;
                    break;
                case '[':
                    val *= 3;
                    stack[peek++] = temp;
                    break;
                case ')':
                    if (i > 0 && text.charAt(i - 1) == '(')
                        sum += val;
                    if (peek == 0) {
                        writer.write(String.valueOf(0));
                        writer.flush();
                        writer.close();
                        return;
                    }
                    if (stack[peek - 1] == '(')
                        peek--;
                    val /= 2;
                    break;
                case ']':
                    if (i > 0 && text.charAt(i - 1) == '[')
                        sum += val;
                    if (peek == 0) {
                        writer.write(String.valueOf(0));
                        writer.flush();
                        writer.close();
                        return;
                    }
                    if (stack[peek - 1] == '[')
                        peek--;
                    val /= 3;
                    break;
            }
        }
        if (peek == 0) {
            writer.write(String.valueOf(sum));
        } else {
            writer.write(String.valueOf(0));
        }
        writer.flush();
        writer.close();
    }
}

