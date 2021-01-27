package calendar;

import java.util.Scanner;

public class Prompt {

	public int parseDay(String week) {
		if (week.equals("sun"))
			return 0;
		else if (week.equals("mon"))
			return 1;
		else if (week.equals("tue"))
			return 2;
		else if (week.equals("wed"))
			return 3;
		else if (week.equals("thu"))
			return 4;
		else if (week.equals("fri"))
			return 5;
		else if (week.equals("sat"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;
		int weekday = 0;

		while (true) {
			System.out.println("연도을 입력하세요...-1을 입력하면 종료합니다.");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if (year == -1)
				break;
			System.out.println("달을 입력하세요...-1을 입력하면 종료합니다.");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			System.out.println("첫번째 요일을 입력하세요. (sun, mon, tue, wed, thu, fri, sat)");
			System.out.print("WEEKDAY> ");
			String week = sc.next();
			weekday = parseDay(week);
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, month, weekday);
			System.out.println();
		}
		System.out.print("끝");
		sc.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
