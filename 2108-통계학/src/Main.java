import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
	static class Bindo {
		public Bindo(int num, int bin) {
			super();
			this.num = num;
			this.bin = bin;
		}

		int num;
		int bin;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> count = new HashMap<>();

		int n = Integer.parseInt(reader.readLine());

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
			if (count.get(a[i]) == null)
				count.put(a[i], 1);
			else
				count.put(a[i], count.get(a[i]) + 1);
		}

		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += a[i];
		writer.write(String.format("%.0f", sum / (double) n) + "\n");

		Arrays.sort(a);
		writer.write(a[n / 2] + "\n");

		Bindo bindo[] = new Bindo[count.keySet().size()];
		int i = 0;
		int max = 0;
		for (int key : count.keySet()) {
			bindo[i++] = new Bindo(key, count.get(key));
			if (max < count.get(key))
				max = count.get(key);
		}

		ArrayList<Integer> array = new ArrayList<>();
		for (i = 0; i < bindo.length; i++) {
			if (bindo[i].bin == max)
				array.add(bindo[i].num);
		}
		Collections.sort(array);
		/*for (i = 0; i < array.size(); i++) {
			writer.write(array.get(i) + " ");
		}*/
		if(array.size()>1)
			writer.write(array.get(1) + "\n");
		else
			writer.write(array.get(0) + "\n");
		
		writer.write((a[n - 1] - a[0]) + "\n");
		writer.flush();
		writer.close();
	}
}
