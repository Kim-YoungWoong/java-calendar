package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("일	월	화	수	목	금	토");
		System.out.println("--------------------------------------------------");
		System.out.println(" 1	 2	 3	 4	 5	 6	 7");
		System.out.println(" 8	 9	10	11	12	13	14");
		System.out.println("15	16	17	18	19	20	21");
		System.out.println("22	23	24	25	26	27	28");

		int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};

		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요: ");
		int month = sc.nextInt();
		int m = month - 1;
		System.out.println((m + 1) + "월은 " + monthArr[m] + "일까지 있습니다.");
		
		sc.close();
	}

}
