package random_problems;

public class Problem_418 {
	public static void main (String[] args) {
		double sum = 1;
		for (int i = 1; i <= 43; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
