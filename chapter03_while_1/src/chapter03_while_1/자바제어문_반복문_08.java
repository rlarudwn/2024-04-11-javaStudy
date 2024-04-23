package chapter03_while_1;

import java.util.Scanner;

public class 자바제어문_반복문_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 정수 : ");
			int num_1 = scanner.nextInt();
			System.out.print("연산자 입력 (+, -, *, /)	=> 종료시 q 입력: ");
			char op = scanner.next().charAt(0);
			if(op == 'q' || op == 'Q') {
				System.out.println("계산기 종료");
				break;
			}
			System.out.print("두번째 정수 : ");
			int num_2 = scanner.nextInt();

			/*if(op == '+') 
				System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
			else if(op == '-') 
				System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
			else if(op == '*') 
				System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
			else if(op == '/') 
				if(num_2 != 0)
					System.out.printf("%d / %d = %.2f\n", num_1, num_2, (double)num_1 / num_2);
				else 
					System.out.println("0으로 나눌 수 없습니다\n");
			else
				System.out.println("연산자를 잘못 입력했습니다\n");*/
			switch (op) {
			case '+':
				System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
				break;
			case '-':
				System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
				break;
			case '*':
				System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
				break;
			case '/':
				if(num_2 != 0)
					System.out.printf("%d / %d = %.2f\n", num_1, num_2, (double)num_1 / num_2);
				else 
					System.out.println("0으로 나눌 수 없습니다\n");
				break;
			default:
				System.out.println("연산자를 잘못 입력했습니다.");
			}


		}
	}
}
