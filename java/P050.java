package q_Duel;

public class Problem_50 {
	public static void main (String[] args){
		int tal;
		int y;
		int primTal=0;
		for (int x=1; x<10; x++){
			tal=0;
			y=x;
			while (tal+y<1000000){
				if (isPrime(y)){
					tal+=y;
				}
				if (isPrime(tal)){
					if(tal>primTal){
						primTal=tal;
					}
				}
				y++;
			}
		}
		System.out.println(primTal);
	}
	public static boolean isPrime(int n) {
		//check if n is a multiple of 2
		if (n==2) return true;
		if (n%2==0 || n==1) return false;
		//if not, then just check the odds
		for(int i = 3; i*i <= n; i += 2) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
