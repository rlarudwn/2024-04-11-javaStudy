package chapter_01_03_정리;

import java.util.Scanner;

public class 자바제어문_다중조건문 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 영화 목록보기");
			System.out.println("2. 영화 상세보기");
			System.out.println("3. 영화 검색 목록 보기");
			System.out.println("4. 영화 추천 목록 보기");
			System.out.println("5. 영화 예약하기");
			System.out.println("6. 종료");
			System.out.println("===============");
			System.out.println("메뉴 선택");
			int menu = scanner.nextInt();
			if(menu == 6) {
				System.out.println("시스템 종료");
				break;
			}
			else if(menu == 1) {			
				System.out.println("영화 목록 보기");
			}
			else if(menu == 2) {				
				System.out.println("영화 상세보기");
			}
			else if(menu == 3) {			
				System.out.println("영화 검색 목록 보기");
			}
			else if(menu == 4) {				
				System.out.println("영화 추천 목록 보기");
			}
			else if(menu == 5) {				
				System.out.println("영화 예약하기");
			}
		}
	}

}
