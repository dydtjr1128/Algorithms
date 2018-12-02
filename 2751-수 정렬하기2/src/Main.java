import java.io.*;

public class Main {
    private static int tempArray[];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int value[] = new int[n];
        tempArray = new int[n];
        for (int i = 0; i < n; i++)
            value[i] = Integer.parseInt(reader.readLine());

        mergeSort(value, 0, value.length - 1);

        for (int i = 0; i < value.length; i++) {
            writer.write(value[i] + "\n");
        }
        writer.flush();
        writer.close();

    }

    public static void mergeSort(int array[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int i, j, k, l;
        i = start;
        j = mid + 1;
        k = start;
        while (i <= mid && j <= end) {
            if (array[i] > array[j])
                tempArray[k++] = array[j++];
            else
                tempArray[k++] = array[i++];
        }
        if (i > mid) {
            for (l = j; l <= end; l++)
                tempArray[k++] = array[l];
        } else {
            for (l = i; l <= mid; l++)
                tempArray[k++] = array[l];
        }

        System.arraycopy(tempArray, start, array, start, end - start + 1);

    }
}