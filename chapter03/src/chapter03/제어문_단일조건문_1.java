package chapter03;

import java.util.Scanner;

public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		if (num < 0)
			System.out.println("음수입니다.");
		if (num >= 0)
			System.out.println("양수입니다.");
		
		scanner.close();

	}

}
