package quest0418;

import java.util.Scanner;

public class quest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num_1 = scanner.nextInt();
		System.out.print("+, -, *, / 입력: ");
		char op = scanner.next().charAt(0);
		System.out.print("정수 입력: ");
		int num_2 = scanner.nextInt();
		switch (op) {
		case '+' :
			System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
		case '-' :
			System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
		case '*' :
			System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
		case '/' :
			if(num_2 != 0)
			System.out.printf("%d / %d = %.2f\n", num_1, num_2, (double)num_1 / num_2);
			else
				System.out.println("0으로 나눌 수 없습니다.");
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		scanner.close();

	}

}
