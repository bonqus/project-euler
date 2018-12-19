/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

package from_01_to_10;

public class Problem_03 {
	public static void main(String[] args){
		long crap=600851475143l;
		long alt=1;
		for(long i=1; i<crap; i++){
			if(crap%i==0){
				alt*=i;
				System.out.print(i+" ");
			}
			if(alt==crap){
				break;
			}
		}
	}
}
