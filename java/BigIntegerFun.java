package algoritmer;

import java.math.BigInteger;

public class BigIntegerFun {
	public static void main (String [] args) {
		BigInteger bi = BigInteger.valueOf(1000000000000000000l);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		bi = bi.multiply(bi);
		BigInteger n = BigInteger.valueOf(997);
		System.out.println(bi.divide(n));
	}
}
