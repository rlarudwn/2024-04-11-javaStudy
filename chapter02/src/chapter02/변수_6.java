package chapter02;

public class 변수_6 {
	public static void main(String[] args) {
		byte byte_val = 10;			// 구분이 없다 	=> -128 ~ 127 사이 정수만 대입
		int int_val = 20;			// 컴퓨터에서는 모든 숫자를 int로 인식
		long long_val = 30l;		// 구분	=> 숫자뒤에 L,l
		
		float flaot_val = 10.5f;	// 4byte	=> 소수점 6자리까지 계산
		double double_val = 10.5;	// 10.5d	=> d,D 생략가능
		
		// 변수	=> 계속 상태가 변경 / 고정	=> 상수
		boolean boolean_val = true;	// 조건식 1byyte	=> true / false 두가지만 저장 가능
		char char_val = 'A';		// 문자 1개 저장	=> 2byte ( 0 ~ 65535 )
		/*
		  	byte = char = int = long = double
		  	boolean	|
		  		  String
		  		  두부조림 양념장 만드는 법
		 */
		char c1 = '두';
		char c2 = '부';
		char c3 = '조';
		char c4 = '림';
		char c5 = ' ';
		char c6 = '양';
		char c7 = '념';
		char c8 = '장';
		char c9 = ' ';
		char c10 = '만';
		char c11 = '드';
		char c12 = '는';
		char c13 = ' ';
		char c14 = '법';
		System.out.println(c1 + "" + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13 + c14);
		
		String s = "두부조림 양념장 만드는 법";
		System.out.println(s);
		
	}
}
