
public class P034 {
	public static void main (String[] args) {
		int sum = 0;
		for(int i = 3; i<1000000; i++){
			if(isfactorial(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean isfactorial (int n) {
		int sum =0;
		String numb = ""+n;
		for(int i = 0; i < numb.length(); i++){
			int k = Integer.parseInt(""+numb.charAt(i));
			sum += factor(k);
			
		}
		return sum == n;
	}
	
	public static int factor (int n) {
		int sum = 1;
		for (int i = 1; i<=n; i++) {
			sum *= i;
		}
		return sum;
	}
}
