package from_41_to_50;

public class Problem_47 {
	
	public static void main (String[] args) {
		int k = 0;
		int n = 2;
		while (k < 1) {
			if (isPrime(n)) {
				k++;
			} else {
				k = 0;
			}
			n++;
		}
		System.out.println(n);
	}
	
	public static boolean isPrime(int n) {
		if (n%2 == 0) {
			return false;
		}
		
		for(int i = 3; i*i <= n; i += 2) {
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
}
