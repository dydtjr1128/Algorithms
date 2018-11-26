import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        boolean isChecked;
        for(int i=0; i<n; i++) {
            String value = reader.readLine();
            char temp = value.charAt(0);
            isChecked = true;
            for(int j=0; j<value.length() && isChecked; j++){
                if(value.charAt(j) != temp){
                    for(int k=j; k<value.length() && isChecked; k++){
                        if(temp == value.charAt(k)){
                            isChecked = false;
                        }
                    }
                    temp = value.charAt(j);
                }
            }
            if (isChecked || value.length()==1) {
                count++;
            }
        }
        writer.write(count+"");

        writer.flush();
        writer.close();

    }
}