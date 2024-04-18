package quest0417;

import java.util.Scanner;

public class quest07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		char op = ' ';
		
		System.out.print("정수 입력:");
		num_1 = scanner.nextInt();
		System.out.print("+, -, *, / 입력:");
		op = scanner.next().charAt(0);
		System.out.print("정수 입력:");
		num_2 = scanner.nextInt();
		
		if (op == '+')
			System.out.printf("%d + %d = %d", num_1, num_2, num_1 + num_2);
		else if (op == '-')
			System.out.printf("%d - %d = %d", num_1, num_2, num_1 - num_2);
		else if (op == '*')
			System.out.printf("%d * %d = %d", num_1, num_2, num_1 * num_2);
		else if (op == '/')
			if (num_2 != 0)
				System.out.printf("%d / %d = %d", num_1, num_2, num_1 / num_2);
			else
				System.out.println("0으로 나눌 수 없습니다");
		else
			System.out.println("연산자를 잘못 입력하셨습니다");

		scanner.close();
	}

}
