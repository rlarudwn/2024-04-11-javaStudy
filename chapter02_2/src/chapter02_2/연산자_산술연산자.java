/*
 		연산자 우선순위
 		()	=>	*, /, %		=> +, -
 */

package chapter02_2;

import java.util.*;		// 자바에서 지원하는 라이브러리 읽음

public class 연산자_산술연산자 {

	public static void main(String[] args) {
		
		int num_1, num_2;	// 실행하면 오류 발생		=> 변수는 초기화 (값 지정) 필요
		Random r = new Random();

		num_1 = r.nextInt(101);		// 0 ~ 100 사이 정수 추출	=> 마지막 제외
		num_2 = r.nextInt(101);
		System.out.println("num_1 = " + num_1);
		System.out.println("num_2 = " + num_2);

		int plus = num_1 + num_2;
		int minus = num_1 - num_2;
		int mul = num_1 * num_2;
		
		System.out.println("plus = " + plus);
		System.out.println("minus = " + minus);
		System.out.println("mul = " + mul);
		
		int a = 10 , b = 3;
		
		System.out.println(a/(double)b);
		System.out.println(a%b);
		System.out.println(a%-b);
		System.out.println(-a%b);
		System.out.println(-a%-b);
		
		System.out.println(5 + 5 * 10);
		System.out.println((5 + 5) * 10);

	}

}
