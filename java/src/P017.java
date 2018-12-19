
public class P017 {
	
	public static void main (String[] args) {
        long start = System.currentTimeMillis();
		String s = new String();
		for (int i = 1; i <= 1000; i++) {
			s += int_to_word(i);
		}

	    System.out.println("Time Elapsed = " +  (System.currentTimeMillis() - start));
		System.out.println(s.length());
		

	}

	public static String int_to_word(int i) {
		String s = new String();
		if (i >= 1000){
			s += one_to_nineteen(i/1000) + "thousand";
			i %= 1000;
		}
		if (i >= 100) {
			s += one_to_nineteen(i/100) + "hundred";
			i %= 100;
			if(i > 0) {
				s += "and";
			}
		}
		if (i >= 20) {
			s += tens(i);
			i %= 10;
		}
		if (i >= 1) {
			s += one_to_nineteen(i);
		}
		return s;
	}

	public static String tens(int i) {
		String s;
		if (i >= 90) {
			s = "ninety";
		}
		else if (i >= 80) {
			s = "eighty";
		}
		else if (i >= 70) {
			s = "seventy";
		}
		else if (i >= 60) {
			s = "sixty";
		}
		else if (i >= 50) {
			s = "fifty";
		}
		else if (i >= 40) {
			s = "forty";
		}
		else if (i >= 30) {
			s = "thirty";
		}
		else {
			s = "twenty";
		}
		
		return s;
	}
	
	public static String one_to_nineteen(int i) {
		String s = new String();
		
		if (i == 1){
			s += "one";
		}
		else if (i == 2) {
			s += "two";
		}
		else if (i == 3) {
			s += "three";
		}
		else if (i == 4) {
			s += "four";
		}
		else if (i == 5) {
			s += "five";
		}
		else if (i == 6) {
			s += "six";
		}
		else if (i == 7) {
			s += "seven";
		}
		else if (i == 8) {
			s += "eight";
		}
		else if (i == 9) {
			s += "nine";
		}
		else if (i == 10) {
			s += "ten";
		}
		else if (i == 11) {
			s += "eleven";
		}
		else if (i == 12) {
			s += "twelve";
		}
		else if (i == 13) {
			s += "thirteen";
		}
		else if (i == 14) {
			s += "fourteen";
		}
		else if (i == 15) {
			s += "fifteen";
		}
		else if (i == 16) {
			s += "sixteen";
		}
		else if (i == 17) {
			s += "seventeen";
		}
		else if (i == 18) {
			s += "eighteen";
		}
		else if (i == 19) {
			s += "nineteen";
		}

		return s;
	}
}
