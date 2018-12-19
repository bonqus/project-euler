
import java.math.BigInteger;


public class P020 {
	public static void main (String[] args){
		BigInteger sum = BigInteger.valueOf(1);
		BigInteger temp = BigInteger.valueOf(1);
		for (long i=1; i<=10000; i++){
			temp=BigInteger.valueOf(i);
			sum=sum.multiply(temp);
		}
		String streng =""+sum;
		int tempi;
		int sumi=0;
		System.out.println(sum);
		for(int i=0; i<streng.length(); i++){
			tempi=Character.getNumericValue(streng.charAt(i));
			sumi+=tempi;
		}
		System.out.println(sumi);
	}
}
