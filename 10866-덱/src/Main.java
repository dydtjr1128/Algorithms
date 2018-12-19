import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String temp;
        int deque[] = new int[n];
        int back = 0;
        for (int i = 0; i < n; i++) {
            temp = reader.readLine();
            if (temp.startsWith("push_front")) {
                System.arraycopy(deque, 0, deque, 1, back++);
                deque[0] = Integer.parseInt(temp.split(" ")[1]);
            } else if (temp.startsWith("push_back")) {
                deque[back++] = Integer.parseInt(temp.split(" ")[1]);
            } else if (temp.equals("pop_front")) {
                if (back > 0) {
                    writer.write(String.valueOf(deque[0]));
                    System.arraycopy(deque, 1, deque, 0, --back);
                } else {
                    writer.write(String.valueOf(-1));
                }
                writer.newLine();
            } else if (temp.equals("pop_back")) {
                if (back > 0) {
                    writer.write(String.valueOf(deque[--back]));
                } else {
                    writer.write(String.valueOf(-1));
                }
                writer.newLine();
            } else if (temp.equals("size")) {
                writer.write(String.valueOf(back));
                writer.newLine();
            } else if (temp.equals("empty")) {
                writer.write(String.valueOf(back == 0 ? 1 : 0));
                writer.newLine();
            } else if (temp.equals("front")) {
                writer.write(String.valueOf(back > 0 ? deque[0] : -1));
                writer.newLine();
            } else if (temp.equals("back")) {
                writer.write(String.valueOf(back > 0 ? deque[back-1] : -1));
                writer.newLine();
            }
        }
        writer.flush();
        writer.close();
    }
}
