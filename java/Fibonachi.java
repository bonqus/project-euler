package algoritmer;

public class Fibonachi {
	public static int f;
	public static int f1 = 0;
	public static int f2 = 1;

	public static void main (String[] args){
		//		for(int i=0; i<10; i++){
		//			System.out.println(fibo());
		//		}
		//		for(int i = 0; i<1000; i++){
		//			if(isFibonachi(i)){
		//				System.out.println(i);
		//			}
		//		}
		int k = 100;
		System.out.println(isFibonachi(k));

	}

	public static int fibo(){
		f = f1 + f2;
		f2 = f1;
		f1 = f;
		return f;
	}

	public static boolean isFibonachi(int n){
		int f_1 = 1;
		int f_2 = 0;
		int f_3 = 1;

		while (f_1 < n){
			f_1 = f_2 + f_3;
			f_3 = f_2;
			f_2 = f_1;
		}

		if(f_1 == n){
			return true;
		}
		
		return false;
	}
}
