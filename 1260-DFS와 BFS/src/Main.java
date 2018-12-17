import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int queue[] = new int[n];
        int index = 0;
        int sIndex = 0, len;
        String temp;

        for (int i = 0; i < n; i++) {
            temp = reader.readLine();
            len = index - sIndex;
            if (temp.startsWith("push")) {
                queue[index++] = Integer.parseInt(temp.substring(5));
            } else if (temp.equals("pop")) {
                if (len > 0) {
                    writer.write(String.valueOf(queue[sIndex++]));
                } else {
                    writer.write(String.valueOf(-1));
                }
                writer.newLine();
            } else if (temp.equals("size")) {
                writer.write(String.valueOf(len));
                writer.newLine();
            } else if (temp.equals("empty")) {
                writer.write(len == 0 ? (String.valueOf(1)) : String.valueOf(0));
                writer.newLine();
            } else if (temp.equals("front")) {
                writer.write(len == 0 ? (String.valueOf(-1)) : String.valueOf(queue[sIndex]));
                writer.newLine();
            } else if (temp.equals("back")) {
                writer.write(len == 0 ? (String.valueOf(-1)) : String.valueOf(queue[index - 1]));
                writer.newLine();
            }

        }
        writer.flush();
        writer.close();
    }
}
