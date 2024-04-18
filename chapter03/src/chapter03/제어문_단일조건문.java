package chapter03;

import java.util.Scanner;

public class 제어문_단일조건문 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		if (num % 2 == 0)
			System.out.println("짝수입니다.");
		if (num % 2 == 1)
			System.out.println("홀수입니다.");
	}

}
