/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

package from_01_to_10;

public class Problem_04 {
	public static void main(String[] args){
		int x;
		int big=0;
		for(int j=1; j<=999; j++){
			for(int i=1; i<=999; i++){
				x=i*j;
				if (x%10==x/100000){
					if((x%100-x%10)/10==x/10000-x/100000*10){
						if(x/1000%10==(x%1000-x%100)/100){
							if (big<=x){
								big=x;
							}
							
							
						}
						
					}		
				}
			}
		}
		System.out.println(big);
	}
}
