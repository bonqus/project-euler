package from_11_to_20;

public class Problem_19 {
	private static int year = 1900;
	private static int day = 1;
	private static int month = 1;
	private static int dayOfY = 1;
	private static int dayOfM = 1;
	private static int count = 0;

	public static void main (String[] args) {
		for (int i = 1900; i <= 2000; i++) {
			for (; month <= 12; month++) {
				daysOfMonth();
				for (int days = 1; days <= dayOfM; days++) {
					day++;
					if (day == 7 && days == 1 && i>1900) {
						count++;
					}
					if (day > 7) {
						day = 1;
					}
				}
			}
			month = 1;
		}
		System.out.println(count);
	}

	public static void daysOfMonth() {
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			dayOfM = 30;
		} else if (month == 2) {
			if (year % 4 == 0) {
				dayOfM = 29;
			} else  {
				dayOfM = 28;
			}
		} else {
			dayOfM = 31;
		}
	}

}
