/*

		1) 형식
		2) 연산자
			+ : 문자열 결합
			String name = "홍길동"
			String etc = "입니다"
			System.out.println(name + cte);		=> "홍길동입니다"
			
		3) 기능
			equals() : 문자열 일치 여부
			contains() : 문자열에 포함 여부
			
			startswith(): 시작하는 문자열이 같은 경우	=> 검색
			endswith()	: 끝나는 문자열이 같은 경우		=> 확장자 찾기
			
			charAt() : 문자열중에 문자 한개 추출	=> char
			indexOf() : 문자가 몇번째 존재하는지 확인	=> 앞에서부터
			lastIndexOf() : 문자가 몇번째 존재하는지 확인	=> 뒤에서부터 
			
			length() : 문자 갯수
			replace() : 문자 변환
			substring() : 문자열을 자른다
			toUpperCase() : 대문자 변환
			toLowerCase() : 소문자 변환
			trim() : 좌우 공백 제거
			split(), replaceAll(), valueOf()
			=> 원본이 변경되진 않는다.
 */

package chapte_04_1;

import java.util.Scanner;

public class 문자열_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alpha = "abcdefg";
		System.out.println(alpha.length());
		System.out.println(alpha.toUpperCase());
		System.out.println(alpha.replace('f', 'e'));
		System.out.println(alpha.charAt(2));
		String myId = "admin";
		String myPwd = "1234";
		System.out.print("아이디 입력 : ");
		String id = scanner.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scanner.next();
		if(id.equals(myId) && pwd.equals(myPwd))
				System.out.println(id + "님 로그인 되었습니다");
		else
			System.out.println("아이디나 비밀번호가 틀렸습니다");
		System.out.println(alpha.toString());
	}

}
