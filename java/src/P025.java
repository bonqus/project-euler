
import java.math.BigInteger;

public class P025 {
	
	public static BigInteger f = BigInteger.valueOf(1);
	public static BigInteger f_buff_1 = BigInteger.valueOf(0);
	public static BigInteger f_buff_2 = BigInteger.valueOf(0);
	public static String s;
	public static long k = 0;
	
	public static void main (String[] args){
		while(true){
			k += 1;
			s = f.toString();
			if (s.length()==1000){
				System.out.println("f'n = " + k);
				System.out.println("fibo tal = " + f);
				break;
			}
			nextFib();
		}
	}
	
	public static void nextFib(){
		f_buff_1 = f;
		f = f.add(f_buff_2);
		f_buff_2 = f_buff_1;
	}
}
