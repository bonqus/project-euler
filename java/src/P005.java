/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/


public class P005 {
	public static void main(String[] args){
		boolean y=true;
		int j=1;
		while(y== true){
			for(int i=1; i<=20; i++){
				if(j%i!=0){
					break;
				}
				if (i==20){
					System.out.println(j);
					y=false;
				}
			}
			j++;
		}
	}
}
