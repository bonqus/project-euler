public class Primenumber {
	
	public static void main (String[] args){
		for(int i=0; i<1000; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
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
