import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp[] = reader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int deque[] = new int[n];
        int tempArray[] = new int[n];
        int value[] = new int[m];
        int count = 0, index = 0, len = n;
        boolean isExist;
        temp = reader.readLine().split(" ");
        int i, j, q;
        for (i = 0; i < m; i++)
            value[i] = Integer.parseInt(temp[i]);
        for (i = 1; i <= n; i++)
            deque[i - 1] = i;

        for (i = 0; i < m; i++) {
            for (j = 0; j < len; j++) {
                if (value[i] == deque[j]) {//value[]의 i번째 값이 있는 위치(j) 탐색
                    index = j;
                    break;
                }
            }
            System.arraycopy(deque, 0, tempArray, 0, index);
            System.arraycopy(deque, index, deque, 0, len - index);
            System.arraycopy(tempArray, 0, deque, len - index, index);
            if (index < len / 2 + 1) {//중간보다 왼쪽에 있어서 왼쪽으로 밀 때
                count += index;
            } else {//오른쪽으로 밀 때
                count += (len - index);
            }
            System.arraycopy(deque, 1, deque, 0, --len);

        }

        writer.write(String.valueOf(count));
        writer.flush();
        writer.close();
    }
}
