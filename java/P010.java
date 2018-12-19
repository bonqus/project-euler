/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */


public class P010 {
	public static void main (String[] args){
		long begin = System.currentTimeMillis();
		long sum=2;
		for (int x=2; x<2000000; x++){
			if(isPrime(x)==true){
				sum+=x;
			}
		}
		System.out.println(sum);
		long endo = System.currentTimeMillis();	
		System.out.println(endo - begin);
	}

	public static boolean isPrime(int n) {
		//check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}

