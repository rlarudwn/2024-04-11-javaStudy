package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		char op = ' ';
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num_1 = scanner.nextInt();
		System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
		op = scanner.next().charAt(0);
		System.out.print("두번째 숫자를 입력하세요 : ");
		num_2 = scanner.nextInt();
		if(op == '+')
			System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
		else if(op == '-')
			System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
		else if(op == '*')
			System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
		else if(op == '/')
			if (num_2 == 0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d + %d = %.2f\n", num_1, num_2, (double)num_1 / num_2);
		else
			System.out.println("정확한 연산자를 입력해주세요");

		scanner.close();
	}

}
