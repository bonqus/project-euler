/*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
*/

public class P012 {
	public static void main (String[] args){
		long begin = System.currentTimeMillis();
		System.out.println(woop());
		long endo = System.currentTimeMillis();	
		System.out.println(endo - begin);
	}
	public static long woop(){
		long x=0;
		int sum=1;
		long i=0;
		while(true){
			i++;
			x+=i;
			sum=1;
			for(long l=1; l<=Math.sqrt(x); l++){
				if(x%2!=0 || x%3!=0 || x%4!=0 || x%5!=0){
					break;
				}
				if(x%l==0){
					sum+=1;
				}
				if(sum>=250){
					return x;
				}
			}
		}
	}
}
