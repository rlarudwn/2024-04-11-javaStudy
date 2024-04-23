package chapter03_5;

import java.util.Scanner;

public class 자바제어문_반복문_06 {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("2 ~ 9 사이 정수 입력:");
		num = scanner.nextInt();
		for(;;)
			if(num < 2 || num > 9) {
				System.out.print("2 ~ 9 사이 정수 입력:");
				num = scanner.nextInt();
			}
			else
				break;
		for(int i = 1 ; i <= 9 ; i++)
			System.out.printf("%2d * %2d = %2d\n", num, i, num * i);*/

		/*do {
			System.out.print("2 ~ 9 사이 정수 입력:");
			num = scanner.nextInt();
		} while (num < 2 || num > 9);
		
		for(int i = 1 ; i <= 9 ; i++)
			System.out.printf("%2d * %2d = %2d\n", num, i, num * i);*/
		
		for(;;) {
			System.out.print("2 ~ 9 사이 정수 입력:");
			num = scanner.nextInt();
			if(num < 2 || num > 9) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			break;
		}
		for(int i = 1 ; i <= 9 ; i++)
			System.out.printf("%2d * %2d = %2d\n", num, i, num * i);

		scanner.close();
		
	}

}
