import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    private static int tempArray[];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        HashMap<String, String> map = new HashMap<>();
        //중복 제거
        for (int i = 0; i < n; i++) {
            String temp = reader.readLine();
            map.put(temp, temp);
        }
        String value[] = new String[map.size()];
        int count = 0;
        for (String val : map.keySet()) {
            value[count++] = val;
        }

        quickSort(value, 0, value.length - 1);
        int j;
        int len;
        for (int i = 0; i < value.length; i++) {
            len = value[i].length();
            for (j = i + 1; j < value.length; j++) {
                if (len != value[j].length()) {
                    break;
                }
            }

            Arrays.sort(value, i, j);
            i = j-1;
        }

        for (int i = 0; i < value.length; i++) {
            writer.write(value[i] + "\n");
        }
        writer.flush();
        writer.close();
    }

    private static void quickSort(String[] value, int start, int end) {
        if (start < end) {
            int q = partition(value, start, end);
            quickSort(value, start, q - 1);
            quickSort(value, q + 1, end);
        }
    }

    private static int partition(String[] value, int start, int end) {
        int low, high;
        String temp;
        String pivot;
        pivot = value[start];
        low = start;
        high = end + 1;
        do {
            do {
                low++;
            } while (low <= end && pivot.length() > value[low].length());
            do {
                high--;
            } while (high >= start && pivot.length() < value[high].length());

            if (low < high) {
                temp = value[low];
                value[low] = value[high];
                value[high] = temp;
            }
        } while (low < high);

        temp = value[high];
        value[high] = value[start];
        value[start] = temp;
        return high;
    }
}