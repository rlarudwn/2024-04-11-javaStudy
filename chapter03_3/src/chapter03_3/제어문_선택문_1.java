/*
		자바에서 제공하는 제어문 : 필요한 내용만 출력, 반복수행, 반복제어
													=>	종료 (break), 제외 (continue)
											=> for, while, do ~ while
								=> 조건문, 선택문 (다중조건문과 동일)
		조건문
			1) 단일 조건문
				=> 검색	=> 검색어 입력여부 확인, 상세보기
				if (조건){
				 	true일 때 수행
				}
			2) 선택 조건문 : ture / false를 나눠서 처리
				=> 로그인, 아이디 중복
				if (조건){
					ture일 때 수행
				}
				else {
					false일 때 수행
				}
			3) 다중 조건문 : 조건 여러개	=> 한개만 수행
				=> 메뉴 클릭, 키보드
				if (조건1){
					조건1이 true일 때 수행
					false일 경우 조건2로
				}
				else if (조건2){
					조건2가 true일 때 수행
					false일 경우 else로
				}
				else{
					모든 조건이 false일 때 수행
					생략 가능
				}
			4) 선택문 : 다중 조건문을 단순화	=> 웹에서는 거의 사용빈도거 없다	=> front (Router)에서 자주 사용
				한개의 값이 있는 경우	=> 선택문
				범위가 있는 경우	=> 다중 조건문
				switch (정수, 문자, 문자열){
					case : {
							처리문장
						}
					break;
					case : {
							처리문장
						}
					break;
					default :	=> 조건문이 else 역할
				}
				
				같은 처리	score / 10 ==>	10, 9, 8, 7 ...
										-----
										A학점
				switch (score / 10){
					case 10 : A
					break;
					case 9 : A
					break;
				}
				switch (score / 10){
					case 10 : 
					case 9 : A
					break;			=> break가 없는 경우도 있다 (없는 경우 아래 break가 나오기 전까지 전부 동작)
				}
 */

package chapter03_3;

import java.util.Scanner;

public class 제어문_선택문_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		char op;		
		System.out.print("첫번째 정수를 입력하세요 : ");
		num_1 = scanner.nextInt();
		System.out.print("연사자를 입력하세요 (+, -, *, /) : ");
		op = scanner.next().charAt(0);
		System.out.print("두번째 정수를 입력하세요 : ");
		num_2 = scanner.nextInt();
		switch (op) {
		case '+' : {
			System.out.printf("%d + %d = %d", num_1, num_2, num_1 + num_2);
		}
		break;
		case '-' : {
			System.out.printf("%d - %d = %d", num_1, num_2, num_1 - num_2);
		}
		break;
		case '*' : {
			System.out.printf("%d * %d = %d", num_1, num_2, num_1 * num_2);
		}
		break;
		case '/' : {
			if (num_2 != 0)
				System.out.printf("%d / %d = %.2f", num_1, num_2, (double)num_1 / num_2);
			else
				System.out.println("0으로 나눌 수 없습니다.");
		}
		break;
		default:
			System.out.println("연산자를 잘못 입력했습니다.");
		}
	}

}
