package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int num = scanner.nextInt();
		if (num % 3 == 0)
			System.out.printf("%d	=>	3의 배수\n", num);
		if (num % 5 == 0)
			System.out.printf("%d	=>	5의 배수\n", num);
		if (num % 7 == 0)
			System.out.printf("%d	=>	7의 배수\n", num);
	}

}
