/*
 		자바의 기본 문법
 			=> 1. 데이터 저장
 				변수 / 상수	=> 변수 : 데이터를 한개 저장하는 공간, 변경해서 사용 가능
 								=> 메모리 공간 크기 결정	=> 기본 저장 크기 제공 (기본 데이터형)
 									=> 정수
 									=> 실수
 									=> 문자
 									=> 논리
 							=> 상수 : 데이터를 한개 저장하는 공간, 변경해서 사용 불가
 							=> 배열 : 여러개를 동시에 저장 (같은 데이터형만 저장 가능)
 							=> 클래스 : 여러개를 동시에 저장 (다른 데이터형을 저장 가능)
 			=> 2. 데이터 가공 (사용자 요청시)
 				연산자 / 제어문
 					=> 메소드
 			=> 3. 가공된 데이터 출력
 				1) 명령프롬프트	=> Application			=> 윈도우
 				2) 브라우저	=> Web Application
 				3) 핸드폰 	=> Mobile Application
 								=> Java (X), Kotlin, Flutter (Dart)
 			=> 4. 데이터 분석 : Python
 				=>AWS
 				
 		객체 지향 프로그램
 		예외처리
 		라이브러리 활용
 		----------------
 		1. 오라클 연결
 		2. Web			=> JSP	=> JQuery, (Ajax)	=> 1차 프로젝트
 		3. Spring		=>VueJS	=> 2차 프로젝트
 		4. Spring-Boot	=> React	=> 3차 프로젝트 (개인)
 		5. Python : Numpy, Pandas, , Matlotlib, 
 		6. AWS (클라우드)	=> 호스팅
 		*** Full Stack : JavaScript	=> 동적 페이지
 			JQuery (Ajax), VueJS, React (Redux, React-Query)
 				TypeScript, NextJS
 		
 		2024.04.15 연산자
 		
 		1. 변수 : 데이터를 한개 저장하는 메모리 공간
 			데이터를 저장하기 위한 작업
 			1) 메모리에 별칭 설정		=> 주소대신 이름으로 저장
 				=> 식별자	=> 한개의 클래스내에는 같은 변수명을 사용할 수 없다
 				=> 변수명 규칙
 					=> 알파벳이나 한글로 시작한다 (알파벳 대소문자를 구분한다)
 					=> 문자의 갯수는 제한이 없다 (3~10 압축)
 					=> 숫자를 사용할 수 있다 (맨앞에 사용 불가)
 					=> 특수문자 사용 가능 (_, $ 사용)	*** 위치는 상관 없다
 					=> 키워드 : Java에서 사용하는 문자열 (단어)	=> int, double 등
 					=> 공백 사용 불가
 		2) 메모리 크기 (데이터 형)
	 		================================================================================
	 		정수형
	 			byte	=> 1byte	=> -128 ~ 127		=> 네트워크 전송시에 주로 사용 (업로드, 다운로드), 외부 데이터 읽기 (크롤링)
	 					=> byte는 연산처리가 되면 결과값이 int형으로 바뀜
	 					=> byte b = 10; / byte b; b = 10;
	 					=> 초과값이 들어올 경우 2진비트화 후 뒤에서부터 8비트 적용
	 			int		=> 4byte	=> -21억4천 ~ 21억 4천	=> 모든 정수형의 기본형 
	 						=> 가장 많이 사용 (웹	=> 숫자: int)
	 						회원 / 게시판	=> 게시물번호, 조회수 나이 등
	 					=> int i = 10; / int i; i = 10;
	 			long	=> 8byte	=> 금융권, 빅데이터, AI
	 					=> long l = 10; / long l; l = 10;
	 			byte < int < long
	 			
	 			구분자
	 			int a = 100
	 			long b = 100L	=> L, l
	 		================================================================================
	 		실수형
	 			float	=> 4byte	=> 자주 사용하지 않는다
	 			double	=> 8byte	=> 평균, 평점등
	 					=> 실수형의 기본
	 			
	 			구분자
	 			float f = 10.5f	=> F, f
		 			
		 			정수 < 실수		=> 크기는 byte 크기가 아닌 수에 대한 표현 크기
		 			long < float
	 		================================================================================
	 		문자형
	 			char	=> 2byte (0 ~ 65535)	=> 각국의 언어 사용이 가능 (Unicode)
	 					=> 문자 한개를 저장
	 					** 	연산시 정수로 변경
	 						연산처리가 될 때 연산은 같은 데이터형끼리만 연산된다
	 					
	 						10 + 10.5
	 					=>	10.0 + 10.5
	 					
	 						'A' + 1
	 					=>	65 + 1
	 		================================================================================
	 		논리형
	 			boolean	=> 1byte (1 = true, 0 = false)
	 				=> 조건이 있는 경우
	 		================================================================================
	 	3) 초기값
	 		임의로 지정	=> 변수 (필요시 변경 가능)
	 			=> 선언	=> 초기값
	 				사용자로부터 값을 받는 경우, 난수 (임의 추출)
	 			=> 선언과 동시에 초기값	=> int a = 10;
	 	
	 	
	 	연산처리
	 	피연산자 / 연산자
	 	10 + 10
	 	--   --
	 	|     |
	 	-------
	 	   |
	 	  20
	 	
	 	단항연산자 : 연산 대상이 1개
	 		=> 증감연산자 : 1개 증가 / 1개 감소		=> ++ / --
	 			int a = 10;
	 			a++;
	 			=> a = 11
	 			-----------------------
	 			int a = 10;
	 			a--;
	 			=> a = 9
	 			-----------------------
	 			=> 전치연산 : 먼저 증감후 대입
	 				++a
	 				--a
	 			=> 후치연산 : 대입 후 증감
	 				a++
	 				a--
	 			
	 			int a = 10;
	 			int b = ++a
	 			=> a = 11, b = 11
	 			
	 			1) a값 증가
	 			2) b에 a값을 대입
	 			-----------------------
	 			int a = 10;
	 			int b = a++
	 			=> a = 11, b = 10
	 			
	 			1) b에 a값을 대입
	 			2) a값 증가
	 			-----------------------
	 		
		 	=> 부정 연산자 : true -> false / false -> true	=> ! (not)
		 		=> boolean만 사용 가능
		 		boolean b = ture;
		 		!b; 
		 		=> false	=> 조건	=> 로그인, 검색어 등
		 	=> 형변환 연산자	=> 모든 데이터형은 변경 가능 (boolean 제외)
		 		int = > double, double => char 등
		 		(int)10.5	=> 10
		 		=> UpCasting	=> 데이터형을 크게 만든다
		 		=> DownCasting	=> 데이터형을 작게 만든다
		 		
		 		     =======================> UpCasting
		 		byte < char < int < long < float < double
		 			<======================= DownCasting
	 	이항연산자 : 연산 대상이 2개
	 		=> 산술연산자	=>	+, -, *, /, %
	 		=> 비교연산자 : 결과값	=> boolean (true / false)	=> if / if ~ else / 삼향연산자
	 			=> ==	=> 6 == 7 (flase)
	 			=> !=	=> 6 != 7 (true)
	 			=> <, >, <=, >=
	 			숫자, 문자 사용 가능	=> boolean -> == / != 사용 가능
	 			기준점 : 왼쪽
	 			
	 		=> 논리연산자 : 결과값	=> boolean (true / false)
	 			=> && (직렬연산자)	=> 기간, 범위 안에 있는 경우	=> 예약, 체크인 / 체크아웃
	 			=> || (병렬연산자)	=> 기간, 범위를 벗어난 경우
	 			
	 			(조건) && (조건)	=> 결과
	 			(조건) || (조건)	=> 결과
	 			
	 			false	 스킵		=> 최적화 연산
	 			(조건) && (조건)	=> 결과
	 			true     스킵		=> 최적화 연산
	 			(조건) || (조건)	=> 결과
	 			
	 			
	 		=> 대입연산자 : 결과값을 다시 저장할 경우
	 			= : 대입
	 				=> int a = 10
	 				=> +=, -=, *=, /=, %=, op=
	 	삼항연산자 : 연산 대상이 3개	=> 페이징, 복잡한 소스 코딩이 있는 경우
	 								=> 웹, 게임, 네트워크 프로그램
	 		(조건)? 값1 : 값2
	 		=> true		=> 값1
	 		=> false	=> 값2
	 	*** 주의점 : Java의 모든 연산은 같은 데이터형 끼리만 가능
	 			=> 데이터를 큰형으로 변경후 연산
	 				=> int보다 작은 데이터형은 연산시에 결과값이 int
			 		***데이터 형 크기
			 		byte < char < int < long < float < double
			 	
	 		
	 	
 */

package chapter02_2;

public class 연산자_1 {

	public static void main(String[] args) {

		int kor = 90;
		int eng = 80;
		int math = 75;
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
		System.out.printf("평균 : %.2f", avg);
	}

}
