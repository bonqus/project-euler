
import java.util.ArrayList;

public class P029 {
	public static void main (String[] args) {
		System.out.println(combo(2,100));
	}

	public static int combo(int a, int b) {
		ArrayList<Double> combos = new ArrayList<Double>();
		for (int x = a; x <= b; x++) {
			for (int y = a; y <= b; y++) {
				double buff = Math.pow(x, y);
				if (!combos.contains(buff)) {
					combos.add(buff);
				}
			}
		}

		return combos.size();
	}
}
