package chapter03_while_1;

import java.util.Scanner;

public class 자바제어문_반복문_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1 ~ 9 정수를 입력해주세요");
		int num = scanner.nextInt();
		
		System.out.println("===== for문 =====");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%2d * %2d = %2d\n", num, i, num * i);
		}
		
		System.out.println("===== while문 =====");
		int i = 1;
		while(i <= 9) {
			System.out.printf("%2d * %2d = %2d\n", num, i, num * i);
			i++;
		}
	}

}
