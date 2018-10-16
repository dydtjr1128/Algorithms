import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x, y;
		try {
			String read[] = reader.readLine().split(" ");
			x = Integer.parseInt(read[0]);
			y = Integer.parseInt(read[1]);

			map.put(1, 31);
			map.put(3, 31);
			map.put(5, 31);
			map.put(7, 31);
			map.put(8, 31);
			map.put(10, 31);
			map.put(12, 31);
			map.put(4, 30);
			map.put(6, 30);
			map.put(9, 30);
			map.put(11, 30);
			map.put(2, 28);
			String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

			int sumdate = 0;
			if (x > 1) {
				for (int i = 1; i < x; i++) {
					sumdate+=map.get(i);
				}
			}
			sumdate+=y;
			System.out.println(day[sumdate%=7]);

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}