package chapter02_3;

import java.util.Scanner;

public class 연산자_삼항연산자_1 {

	public static void main(String[] args) {
		/*char c = 'a';
		System.out.println(c);
		System.out.println(c>='A' && c<='Z'?"대문자":"소문자");*/
		
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("알파벳 입력:");
		char c = sc.next().charAt(0);
		System.out.println(c);
		// 문자 입력 sc.next().charAt(0);
		// 정수 입력 sc.nextInt();
		// 논리 입력 sc.nextBoolean();
		// 실수 입력 sc.nextDouble();
		System.out.println(c >= 'A' && c<= 'Z'?"대문자":"소문자");
		}

	}

}
