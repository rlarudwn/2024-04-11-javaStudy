package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		char op = ' ';
		System.out.print("첫번째 정수 입력 : ");
		num_1 = scanner.nextInt();
		System.out.print("사칙연산 입력 (+, -, *, /) : ");
		op = scanner.next().charAt(0);
		System.out.print("두번째 정수 입력 : ");
		num_2 = scanner.nextInt();
		
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			if(op == '+')
				System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
			if(op == '-')
				System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
			if(op == '*')
				System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
			if(op == '/')
				if (num_2 == 0)
					System.out.println("0으로 나눌 수 없습니다");
				else
					System.out.printf("%d + %d = %.2f\n", num_1, num_2, (double)num_1/num_2);
		}
		else
			System.out.println("잘못된 연산자를 입력하셨습니다");
		

	}

}
