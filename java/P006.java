/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

package from_01_to_10;

public class Problem_06 {
	public static void main (String[] args){
		long sumsq;
		long sqsum=0;
		long x=100;
		sumsq=((x+1)*x)/2;
		sumsq=sumsq*sumsq;
		for(int i=0; i<=100; i++){
			sqsum+=i*i;
		}
		System.out.println(sumsq-sqsum);
	}
}