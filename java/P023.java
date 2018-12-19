package from_21_to_30;

import java.util.ArrayList;

public class Problem_23 {

	public static ArrayList<Long> abundant = new ArrayList<Long>();
	public static ArrayList<Long> perfect = new ArrayList<Long>();
	public static ArrayList<Long> deficient = new ArrayList<Long>();
	public static ArrayList<Long> doubabu = new ArrayList<Long>();


	public static void main (String[] args) {
		analyseAll();
		System.out.println(abundant.size());
		for (int x = 0; x < abundant.size(); x++) {
			for (int y = x; y < abundant.size(); y++) {
				long j = abundant.get(x);
				long h = abundant.get(y);
				if(j+h<=28123){
					if(!doubabu.contains(j + h)) {
						doubabu.add(j+h);
					}
				}
			}
		}
		long sum = 0;
		for (long i = 0; i <= 28123; i++) {
			sum += i;
		}
		long sumdoub = 0;
		for (long ab : doubabu) {
			sumdoub += ab;
		}
		System.out.println(sum-sumdoub);
	}

	public static void analyseAll() {
		for (long i = 0; i <= 28123; i++) {
			analyseN(i);
		}
	}

	public static void analyseN (long n) {
		int sum = 0;
		for (long i = n+2/2; i >= 1; i--) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum > n) {
			abundant.add(n);
		} else if (sum < n) {
			deficient.add(n);
		} else {
			perfect.add(n);
		}
	}
}
