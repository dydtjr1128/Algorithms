import java.io.*;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void drawStar(int n) {
        String triangle[] = new String[3];
        triangle[0] = "*";
        triangle[1] = "* *";
        triangle[2] = "*****";
        try {
            int space = 5;
            int spaceTemp = 5;

            double k = Math.log(n / 3) / Math.log(2);
            String array[] = new String[n];
            int arrayIndex = 3;
            StringBuilder builder = new StringBuilder();

            array[0] = triangle[0];
            array[1] = triangle[1];
            array[2] = triangle[2];

            for (int i = 0; i < k; i++) {//반복 횟수
                int size = arrayIndex;
                for (int j = 0; j < size; j++) {
                    String t = array[j];
                    builder.setLength(0);//Clear builder
                    builder.append(t);
                    for (int q = 0; q < space; q++)
                        builder.append(" ");
                    space -= 2;
                    builder.append(t);
                    array[arrayIndex++] = builder.toString();
                }
                space = spaceTemp * 2 + 1;
                spaceTemp = space;
            }

            builder.setLength(0);
            n--;
            for (int i = 0; i < arrayIndex; i++, --n) {
                for (int j = 0; j < n; j++)
                    builder.append(" ");
                builder.append(array[i]);
                for (int j = 0; j < n; j++)
                    builder.append(" ");
                if (i < arrayIndex - 1)
                    builder.append("\n");
            }
            writer.write(builder.toString());


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int n = Integer.parseInt(reader.readLine());
        drawStar(n);
        writer.flush();
        writer.close();

    }
}