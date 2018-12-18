import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            queue.add(i);
        int s = m - 1;
        int sum;
        writer.write("<");
        while (!queue.isEmpty()) {
            builder.append(((LinkedList<Integer>) queue).remove(s)).append(", ");
            sum = s + m - 1;
            if (!queue.isEmpty()) {
                s = queue.size() > (sum) ? sum : sum % queue.size();
            } else
                break;
        }

        writer.write(builder.substring(0,builder.length()-2));
        writer.write(">");
        writer.flush();
        writer.close();
    }
}
