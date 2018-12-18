import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(reader.readLine());
        int n, m, i, j;
        String temp[], temp2[];
        Queue<Integer> queue = new LinkedList<>();
        int count, val;
        boolean isExist;
        for (i = 0; i < q; i++) {
            temp = reader.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            temp2 = reader.readLine().split(" ");
            count = 0;
            for (j = 0; j < n; j++) {
                queue.add(Integer.parseInt(temp2[j]));
            }
            while (!queue.isEmpty()) {
                val = ((LinkedList<Integer>) queue).peekFirst();
                isExist = false;
                for (j = 1; j < queue.size(); j++) {
                    if (val < ((LinkedList<Integer>) queue).get(j)) {
                        isExist = true;
                        break;
                    }
                }
                if (isExist) {
                    if (m == 0)
                        m = queue.size() - 1;
                    else m--;
                    val = queue.poll();
                    queue.add(val);
                } else {
                    m--;
                    queue.poll();
                    count++;
                    if (m < 0)
                        break;
                }
            }
            writer.write(String.valueOf(count));
            writer.newLine();
            queue.clear();
        }

        writer.flush();
        writer.close();
    }
}
