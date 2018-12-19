
public class P048 {
	public static void main (String[] args) {
		long sum = 0;
		for (long i = 1; i <= 1000; i++) {
			sum += pow(i);
			sum%=10000000000l;
		}
		System.out.println(sum);
	}
	
	public static long pow (long n) {
		long sum = 1;
		for(long i = 0; i < n; i++) {
			sum *= n;
			sum%=10000000000l;
		}
		return sum;
	}
}
