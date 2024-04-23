package chapter03_5;

import java.util.Scanner;

public class 자바제어문_반복문_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 대문자 입력 : ");
		char check = scanner.next().charAt(0);
		
		if(check < 'A' || check >'Z')
			System.out.println("대문자 알파벳을 입력해주세요");
		
		int cnt = 1;
		
		for(char c = 'A' ; c <= 'Z' ; c++) {
			if(c == check)
				break;
			cnt++;
			}
		System.out.println(check + "는 " + cnt + "번째 자리");
		scanner.close();
	}

}
