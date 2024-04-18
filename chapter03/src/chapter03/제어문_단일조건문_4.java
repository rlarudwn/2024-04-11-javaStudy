package chapter03;

import java.util.Scanner;

public class 제어문_단일조건문_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		System.out.println("========== 결과 ==========");
		if (c >= 'A' && c <= 'Z')
			System.out.println("대문자 입니다.");		
		if (c >= 'a' && c <= 'z')
			System.out.println("소문자 입니다.");
		if (!((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')))
			System.out.println("알파벳이 아닙니다.");
		

	}

}
