
import java.math.*;

public class P016 {
	public static void main (String[] args){
		int nysum=0;
		int temp;
		BigInteger sum = BigInteger.valueOf(2);

		sum=sum.pow(1000);

		System.out.println(sum);
		String hej = sum.toString();
		for(int x=0; x<hej.length(); x++){
			temp=Character.getNumericValue(hej.charAt(x));
			nysum+=temp;
		}
		System.out.println(nysum);
	}
}
