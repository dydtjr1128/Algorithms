import java.io.*;

public class Main {
    private static int tempArray[];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = reader.readLine();
        int value[] = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++)
            value[i] = temp.charAt(i) - '0';

        quickSort(value, 0, value.length - 1);

        for (int i = 0; i < value.length; i++) {
            writer.write(value[i] + "");
        }
        writer.flush();
        writer.close();
    }

    private static void quickSort(int[] value, int start, int end) {
        if (start < end) {
            int q = partition(value, start, end);
            quickSort(value, start, q - 1);
            quickSort(value, q + 1, end);
        }
    }

    private static int partition(int[] value, int start, int end) {
        int pivot, low, high, temp;
        pivot = value[start];
        low = start;
        high = end + 1;
        do {
            do {
                low++;
            } while (low <= end && pivot < value[low]);
            do {
                high--;
            } while (high >= start && pivot > value[high]);

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