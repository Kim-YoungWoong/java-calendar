package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 수를 입력하세요: ");
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println("두 수의 합: " + (a + b));
		sc.close();
	}
}
