package calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDaysofMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		} else
			return MAX_DAYS[month];
	}

	public void printCalendar(int year, int month) {
		System.out.printf("               <<%d년  %10d월>>\n", year, month);
		System.out.println("Sun	Mon	Tue	Wed	Thu	Fri	Sat");
		System.out.println("--------------------------------------------------");

		int weekday = getWeekday(year, month, 1);

		for (int i = 0; i < weekday; i++) {
			System.out.print("\t");
		}

		int maxDay = getMaxDaysofMonth(year, month);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;

		for (int i = 1; i <= count; i++) {
			System.out.printf("%d\t",i);
		}
		System.out.println();

		count++;
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%d\t",i);
			if (i % 7 == delim)
				System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	private int getWeekday(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 4;// thursday, 1970 1월 1일 목요일

		int count = 0;

		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}

		for (int i = 1; i < month; i++) {
			int delta = getMaxDaysofMonth(year, i);
			count += delta;
		}

		count += day - 1;

		int weekday = (count + STANDARD_WEEKDAY) % 7;

		return weekday;
	}
}
