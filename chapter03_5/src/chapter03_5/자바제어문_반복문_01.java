/*
		조건문 : 프로그램을 제어	=> 사용자 입력	=> 처리
			=> 조건 : 부정연산자, 비교연산자, 논리연산자	=> 결과 : true / false
			=> 단일조건문
				=> if 단독으로 사용
				if(조건){
					true일 때 동작
				}
				=> 검색어가 없다, 없는 페이지
			=> 선택조건문
				=> if / else	=> ture / false
								if(조건){
					true일 때 동장
				}
				else{
					false일 때 동작
				}
				=>로그인 처리
			=> 다중조건문 : 조건에 맞는 경우에만 1번 수행
				if(조건1){
					true일 때 동작
					false일 때 조건2로 이동
				}
				else if(조건2){
					true일 때 동작
					false일 때 조건3으로 이동	
				}
				else if(조건3){
					true일 때 동작
					false일 때 else로 이동
				}
				else{
				모든 조건이 false일 때 동작
				생략 가능
				}
				=> 메뉴 선택
		반복문 : 여러개의 반복적인 소스코딩이 있는 경우 사용
			=> 상품목록, 영화목록 등 목록 출력 등
				출력 내용이 같은 경우가 아닌 형식이 같은 경우
			=> 웹	=> for / while
			for : 반복횟수가 지정된 경우
				=> 웹 화면 UI는 for을 주로 이용
					중첩 for	=> 코딩 테스트에 주로 나옴
					 1		2		4
				for(초기값 ; 조건문 ; 증가식){
					수행문 3
				}
				1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 ...
				=> 2번 조건이 false가 될 경우 종료
				for(int i = 1 ; i <= 10 ; i++)	=>10번 반복
												=> 증가식은 꼭 1씩 증가하는 것은 아니다
				for(int i = 10 ; i >= 1 ; i--)	=>10번 반복
												=> 감소	=> 최신 등록 데이터 읽기
			while
				=> 무한스크롤 : 반복힛수가 없는 경우 사용
			do ~ while	=> 반드시 한번이상 수행할 때 사용
 */

package chapter03_5;

public class 자바제어문_반복문_01 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10 ; i++)
			System.out.print(i + " ");
		System.out.println();
		for(int i = 10 ; i >= 1 ; i--)
			System.out.print(i + " ");
		System.out.println();
		for(char c = 'A' ; c <= 'Z' ; c++)
			System.out.print(c + " ");
		System.out.println();
		for(char c = 'Z' ; c >= 'A' ; c--)
			System.out.print(c + " ");

	}

}
