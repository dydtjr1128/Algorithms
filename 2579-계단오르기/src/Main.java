import java.io.*;

public class Main {
    public static int maxSum = 0;
    public static int n;

    public static void dfs(int array[], int index, int sum, int count) {
        if (index > n || count > 2) return;
        else if (index == n) {
            if (count == 2) return;
            //System.out.println(" : " + sum);
            if (maxSum < sum)
                maxSum = sum;
            return;
        }
        /*        if (count < 2) {*/
        //System.out.print(index +">");
        dfs(array, index + 1, sum + array[index + 1], count + 1);


        if (index + 2 > n)
            return;
        //System.out.print(index +">");
        dfs(array, index + 2, sum + array[index + 2], 1);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(reader.readLine()) - 1;
        int array[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        dfs(array, -1, 0, 0);

        writer.write(String.valueOf(maxSum));

        reader.close();
        writer.flush();
        writer.close();
    }
}
