/*
		반복	=> 필요한 내용만 출력(조건문)
 */
package chapter03_5;

public class 자바제어문_반복문_02 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++)
			if(i % 2 != 0)
				System.out.print(i + " ");
		System.out.println();
		for(int i = 1 ; i <= 10 ; i++)
			if(i % 2 == 0)
				System.out.print(i + " ");
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");		// 가독성	=> 다른 프로그래머가 봤을 때 알아보기 쉬움
										//		=> 유지보수 어려움 

		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < i ; j++)
				System.out.print("*");
			System.out.println();
		}								//	유지보수 쉬움
										// 가독성 = 유지보수 = 최적화

	}
}
