package from_21_to_30;

public class Problem_21 {
	
	public static void main (String[] args){
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			int a = prprDevisorSum(i);
			int b = prprDevisorSum(a);
			if (i == b && a != b) {
				sum += i;
			}
		}
		System.out.println("The sum of all the amicable numbers under 10000 : " + sum);
	}
	
	public static int prprDevisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0){
				sum += i;
			}
		}
		return sum;
	}
}
