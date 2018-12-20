import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());
        String func, temp, val[];
        int size, j, s, e;
        int array[];
        boolean isErr;
        boolean isReverse;
        for (int i = 0; i < n; i++) {
            builder.setLength(0);
            func = reader.readLine();
            size = Integer.parseInt(reader.readLine());
            temp = reader.readLine();
            array = new int[size];
            isErr = false;
            isReverse = false;
            s = 0;
            e = size;
            val = temp.substring(1, temp.length() - 1).split(",");

            for (j = 0; j < size; j++)
                array[j] = Integer.parseInt(val[j]);
            for (j = 0; j < func.length(); j++) {
                switch (func.charAt(j)) {
                    case 'R':
                        isReverse = !isReverse;
                        break;
                    case 'D':
                        if (size == 0) {
                            isErr = true;
                            break;
                        }
                        if (isReverse) {//뒤집히면 배열 뒤에서 빼면됨
                            size--;
                            e--;
                        } else {//아니면 앞에서 빼면됨
                            size--;
                            s++;
                        }
                        break;
                }
            }
            if (isErr) {
                writer.write("error\n");
            } else if (isReverse) {
                writer.write("[");
                if (e > s) {
                    for (j = e - 1; j > s; j--) {
                        writer.write(String.valueOf(array[j]));
                        writer.write(",");
                    }
                    if (s >= 0) {
                        writer.write(String.valueOf(array[s]));
                    }
                }
                writer.write("]");
                writer.newLine();
            } else {
                writer.write("[");
                if (e > s) {
                    for (j = s; j < e - 1; j++) {
                        writer.write(String.valueOf(array[j]));
                        writer.write(",");
                    }
                    if (e - 1 >= 0) {
                        writer.write(String.valueOf(array[e - 1]));
                    }
                }
                writer.write("]");
                writer.newLine();
            }
        }

        writer.flush();
        writer.close();
    }
}
