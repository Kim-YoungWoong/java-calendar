package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;

		while (true) {
			System.out.println("연도을 입력하세요...-1을 입력하면 종료합니다.");
			System.out.print("YEAR> ");
			year=sc.nextInt();
			System.out.println("달을 입력하세요...-1을 입력하면 종료합니다.");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
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
