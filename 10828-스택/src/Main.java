import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String stack[] = new String[n];
        int top = 0;
        for (int i = 0; i < n; i++) {
            String temp = reader.readLine();
            if (temp.startsWith("push")) {
                stack[top++] = temp.split(" ")[1];
            } else if (temp.equals("top")) {
                if (top > 0)
                    writer.write(stack[top - 1] + "\n");
                else
                    writer.write(-1 + "\n");
            } else if (temp.equals("size")) {
                writer.write(top + "\n");
            } else if (temp.equals("empty")) {
                if (top == 0)
                    writer.write(1 + "\n");
                else
                    writer.write(0 + "\n");
            } else if (temp.equals("pop")) {
                if (top < 1) {
                    writer.write(-1 + "\n");
                    top = 0;
                } else
                    writer.write(stack[--top] + "\n");
            }

        }
        writer.flush();
        writer.close();
    }
}
