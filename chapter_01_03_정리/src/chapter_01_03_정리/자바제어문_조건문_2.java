package chapter_01_03_정리;

import java.util.Scanner;

public class 자바제어문_조건문_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력하세요");
		int sec = scanner.nextInt();
		System.out.printf("%d시간 %d분 %d초", sec / 3600, sec % 3600 / 60 , sec % 60);

	}

}
