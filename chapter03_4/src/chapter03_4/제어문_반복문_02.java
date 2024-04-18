package chapter03_4;

import java.util.Scanner;

public class 제어문_반복문_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		for (int i = 1 ; i < 10 ; i++)
			System.out.printf("%d * %d = %d\n", num, i, num * i);
	}

}
