/*
		while
			=> for문과 동일한 반복문
			=> 반복 횟수가 정해진 동작			=> for
			=> 반복 횟수가 정해지지 않은 동작	=> while
			=> 정해지진 않았으나 대체로 사용
			=> 파일 읽기 , 데이터베이스 읽기, 네트워크 서버	=> Back-End
			=> 화면 출력, 페이지 나누기				=> Front-End
			while(조건식){
				수행 동작
				증가식
			}
			for(int i = 1 ; i <= 10 ; i++){
				System.out.print(i + " ")
			}
			
			int i = 1;
			while(i <= 10){
				System.out.print(i + " ")
				i++;
			}
 */
package chapter03_while_1;

public class 자바제어문_반복문_01 {

	public static void main(String[] args) {
		System.out.println("===== for문 =====");
		for(int i = 1 ; i <= 10 ; i++)
			System.out.print(i + " ");
		System.out.println("\n===== while문 =====");
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
	}

}
