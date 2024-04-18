/*
	Office				
	HTML/CSS			
	Java - Spring		
	Spring-Boot, JPA	
	Python				
	머신러닝 - 딥러닝 - AI	
		자바에서 지원하는 제어문
			모든 제어문은 바로 밑에 있는 문장만 제어할 수 있다
			=> 프로그램의 흐름
				=> 건너뛴다 / 스킵
					=> 조건문
						단일조건문
							if (조건){
								조건이 true일 경우 수행
							}
						선택조건문
							if (조건){
								조건이 true일 경우 수행
							}
							else{
								조건이 false일 경우 수행
							}
						다중조건문
							if (조건){
								조건이 true일 경우 수행
								조건이 false일 경우 다음 조건으로
							}
							else if (조건){
								조건이 true일 경우 수행
								조건이 false일 경우 다음 조건으로
							}
							else{
								조건이 false일 경우 수행
								생략가능
							}
				=> 필요한 부분 선택
					=> 선택문
				=> 여러개 반복
					=> 반복문
						for : 횟수가 지정된 경우
						while : 반복 횟수가 없는 경우	=> 서버, 게임, 데이터베이스
						do ~ while
				=> 반복에서 나가기
					=> 반복제어문
		변수 / 연산자 / 제어문	=> 데이터베이스	=> 웹사이트
			
			재사용	=> 메소드
 */
package chapter03;

import java.util.Scanner;

public class 제어문_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력");
		int score = scanner.nextInt();
		System.out.println(score>=60?"합격":"불합격");
		/*if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");*/
		if(score >= 60)
			System.out.println("합격");
		if(score < 60)
			System.out.println("불합격");

	}

}
