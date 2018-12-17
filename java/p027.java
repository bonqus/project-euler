package from_21_to_30;

public class Problem_27 {
	
	public static void main (String [] args) {
		int n = 0;
		int max = 0;
		int maxa = 0;
		int maxb = 0;
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				while (isPrime(n*n+a*n+b)){
					n++;
				}
				if (n > max) {
					max = n;
					maxa = a;
					maxb = b;
				}
				n = 0;
			}
		}
		System.out.println(max + " a = " + maxa + " b = " + maxb);
		System.out.println(maxa*maxb);
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
