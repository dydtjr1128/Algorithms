import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int score = 0;
        int totalScore = 0;
        for (int i = 0; i < n; i++) {
            String temp = reader.readLine();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'O') {
                    score++;
                    totalScore += score;
                } else {
                    score = 0;
                }
            }
            writer.write(totalScore + "\n");
            totalScore = score = 0;
        }

        writer.flush();
        writer.close();

    }
}
