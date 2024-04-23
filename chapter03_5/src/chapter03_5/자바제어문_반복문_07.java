package chapter03_5;

import java.util.Scanner;

public class 자바제어문_반복문_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c;
		/*for(;;) {
			System.out.print("알파벳을 입력해주세요 : ");
			c  = scanner.next().charAt(0);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				break;
			else
				System.out.println("잘못된 입력입니다.");
		}
		System.out.println("입력된 알파벳 : " + c);
		if(c >= 'a' && c <= 'z')
			System.out.println("대문자로 변경 : " +  (char)(c - 32));
		else
			System.out.println("소문자로 변경 : " +  (char)(c + 32));
		System.out.println(c);*/
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("알파벳을 입력해주세요 : ");
			c  = scanner.next().charAt(0);
			if(c >= 'a' && c <= 'z') {
				System.out.println("입력된 알파벳 : " + c);
				System.out.println("대문자 변경 : " + (char)(c - 32));
			}
			else if(c >= 'A' && c <= 'Z') {
				System.out.println("입력된 알파벳 : " + c);
				System.out.println("소문자 변경 : " + (char)(c + 32));
			}
			else {
				System.out.println("잘못 입력하셨습니다");
				i--;
			}
		}
		
		scanner.close();

	}

}
