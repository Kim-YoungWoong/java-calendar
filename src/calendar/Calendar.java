package calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDaysofMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else
			return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("               <<%d년  %10d월>>\n", year, month);
		System.out.println("일	월	화	수	목	금	토");
		System.out.println("--------------------------------------------------");

		int maxDay = getMaxDaysofMonth(year, month);

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%d\t", i);
			if (i % 7 == 0)
				System.out.println();
		}

	}
}
