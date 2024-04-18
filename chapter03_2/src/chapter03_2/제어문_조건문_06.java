package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력 (1 ~ 12) : ");
		int month = scanner.nextInt();
		if (month >=1 && month <= 12) {
			if (month == 1 || month == 2 || month == 12)
				System.out.println("겨울");
			if (month >= 3 && month <= 5)
				System.out.println("봄");
			if (month >= 6 && month <= 8)
				System.out.println("여름");
			if (month >= 9 && month <= 11)
				System.out.println("가을");
		}
		else
			System.out.println("잘못 입력하셨습니다");

	}

}
