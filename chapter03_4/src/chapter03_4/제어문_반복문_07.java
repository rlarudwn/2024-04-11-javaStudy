package chapter03_4;

import java.util.Scanner;

public class 제어문_반복문_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer;
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		for(;;) {
			System.out.print("숫자를 입력해주세요 (1 ~ 100)");
			answer = scanner.nextInt();
			count++;
			if (answer < com)
				System.out.println("정답보다 작습니다");
			else if (answer > com)
				System.out.println("정답보다 큽니다");
			else if (answer == com) {
				System.out.println("정답입니다");
				break;
			}
			else {
				System.out.println("1 ~ 100 정수를 입력해야 됩니다.");
				count--;
			}
		}
		System.out.println("프로그램 종료");
		System.out.println(count+"번 만에 맞추셨습니다");

	}

}
