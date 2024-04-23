package chapter03_while_1;

import java.util.Scanner;

public class 자바제어문_반복문_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int cnt = 0;
		while(true) {
			System.out.print("1 ~ 100 사이에 정수를 입력하세요");
			int answer = scanner.nextInt();
			if(answer < 1 || answer > 100) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			cnt++;
			if(answer < com) {
				System.out.println("정답보다 작습니다.");
			}
			else if(answer > com) {
				System.out.println("정답보다 큽니다.");
			}
			else{
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("정답까지 총 "+ cnt +"번 걸렸습니다.");
	}

}
