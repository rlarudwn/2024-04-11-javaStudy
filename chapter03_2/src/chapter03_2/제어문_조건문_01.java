/*
	프로그램 형식
		1. 평문 : 순차적을 처리	=> 연산자
		2. 조건문	=> 필요에 따라 건너뛴다, 프로그램에 맞게 수행
			=> 로그인, 아이디찾기, 검색, 상세보기
			1) 단일 조건문
				=> 자바에서 제어문은 바로 밑에 있는 문장만 제어할 수 있다.
				if(조건){			=> 조건 (true / false)	=> 부정연산자 / 논리연산자 / 비교연산자
					true일 경우 수행
				}
			2) 선택 조건문	=> true / false를 나눠 처리
			3) 다중 조건문	=> 여러개의 조건중에 1개만 처리
			4) 선택문	=> 값 1개를 선택해서 처리	=> 메뉴, 키보드(게임)
			5) 중첩 조건문
				if(조건1){
					if(조건2){
						=> 조건1 && 조건2
					}
				}
		3. 반복문	=> 같은 동작이 여러번 나오는 경우
			=> 목록 출력, 검색결과
	프로그램 : 라이브러리 사용 / 데이터베이스 (Oracle)	=> 데이터 처리
		사용자가 요청한 데이터만 읽기	=> 출력
			조건	=> 사용자 요청 / 처리 결과물	/사용자 중심의 프로그램
			요구사항 분석	=> 필요한 데이터 저장 (데이터베이스)
			  		   아키텍쳐				DBA
				=> 화면UI	=> 구현 (Java)	=> 테스트	=> 배포
					  퍼블리셔			  웹프로그래머  테스터
					  				(서버 / 클라이언트)	=> Java / Spring
		Spring / Spring-Boot / MyBatis / 
 */

package chapter03_2;

public class 제어문_조건문_01 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 20;
		
		int max = 0;
		int min = 100;
		if(max < a)
			max = a;
		if(max < b)
			max = b;
		
		if(min > a)
			min = a;
		if(min > b)
			min = b;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(Math.max(a, b));
		

	}

}
