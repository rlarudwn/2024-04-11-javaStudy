package chapter03_4;

import java.util.Scanner;

public class 제어문_반복문_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.print("첫번째 정수 입력 : ");
			int num_1 = scanner.nextInt(); 
			System.out.print("연산자 입력 (+, -, *, /) : ");
			char op = scanner.next().charAt(0);
			
			System.out.print("두번째 정수 입력 : ");
			int num_2 = scanner.nextInt();
			switch(op) {
			case '+' :
				System.out.printf("%d + %d = %d\n", num_1, num_2, num_1 + num_2);
			break;
			case '-' :
				System.out.printf("%d - %d = %d\n", num_1, num_2, num_1 - num_2);
			break;
			case '*' : 
				System.out.printf("%d * %d = %d\n", num_1, num_2, num_1 * num_2);
			break;
			case '/' : 
				if(num_2 != 0)
					System.out.printf("%d / %d = %.2f\n", num_1, num_2, (double)num_1 / num_2);
				else
					System.out.println("0으로 나눌 수 없습니다");
			break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다.");
			}
			System.out.print("종료하시겠습니까? (y / n) :");
			char exit = scanner.next().charAt(0);
			if (exit == 'y' || exit == 'Y')
				break;
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}

}
