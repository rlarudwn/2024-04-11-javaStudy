/*
 		단일 조건문 : 독립 문장	=> 여러개 사용시 여러개 출력 가능
 			if(조건){
 				true일 때 동작
 			}
 			flase면 스킵	=> 필요시 동작 수행	=> 건너뛰기 기능
 			오류처리, 유효성검사

 		다중 조건문
 */

package chapter_01_03_정리;

import java.util.Scanner;

public class 자바제어문_조건문_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액 입력 : ");

		int coke = 0,  power = 0, coffee = 0;
		int money = scanner.nextInt();
		int change = money;
		int sel = 0;
		while(sel < 4) {
			System.out.print("1. 콜라 (1900)  2. 파워에이드(1500)  3. 커피(1200) , 4이상 => 종료");
			sel = scanner.nextInt();
			if(sel == 1) {
				if(money >= 1900) {
					System.out.println("콜라 (1900)");
					change -= 1900;
					coke++;
				}
				else
					System.out.println("금액이 부족합니다");
			}
			if(sel == 2) {
				if(money >= 1500) {
					System.out.println("파워에이드 (1500)");
					change -= 1900;
					power++;
				}
				else
					System.out.println("금액이 부족합니다");
			}
			if(sel == 3) {
				if(money >= 1200) {
					System.out.println("커피 (1200)");
					change -= 1900;
					coffee++;
				}
				else
					System.out.println("금액이 부족합니다");
			}
			System.out.println("잔액 : " + change);
		}
		System.out.println("잔액 : " + change);
		System.out.printf("잔돈 1000원 : %d, 500원 : %d, 100원 : %d, 10원 : %d", change / 1000, change % 1000 / 500, change %500 / 100, change % 100 / 10);


	}

}
