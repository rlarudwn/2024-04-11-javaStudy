package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 입력해주세요");
		char c = scanner.next().charAt(0);
		if(c >= 'A' && c <= 'Z')
			System.out.println(c + "\t=>\t대문자");
		else if(c >= 'a' && c <= 'z')
			System.out.println(c + "\t=>\t소문자");
		else if(c >= '0' && c <= '9')
			System.out.println(c + "\t=>\t숫자");
		else
			System.out.println(c + "\t=>\t그 외");

	}

}
