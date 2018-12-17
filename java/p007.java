/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

package from_01_to_10;

public class Problem_07 {
	public static void main (String[] args){
		int tal=0;
		int x=0;
		while (true){
			x++;
			if (isPrime(x)==true){
				tal+=1;
			}
			if (tal==1){
				System.out.println(x);
				break;
			}
		}
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
