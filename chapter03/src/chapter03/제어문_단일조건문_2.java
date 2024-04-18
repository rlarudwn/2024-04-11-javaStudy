package chapter03;

import java.util.Iterator;
import java.util.Scanner;

public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("0 = 가위, 1 = 바위, 2 = 보 입니다.");
		
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3);	
		int result = com - user;
		
		if(user == 0)
			System.out.println("사용자 : 가위");
		if(user == 1)
			System.out.println("사용자 : 바위");
		if(user == 2)
			System.out.println("사용자 : 보");
		
		
		if(com == 0)
			System.out.println("컴퓨터 : 가위");
		if(com == 1)
			System.out.println("컴퓨터 : 바위");
		if(com == 2)
			System.out.println("컴퓨터 : 보");
		
		System.out.println("===== 게임 결과 ======");
		/*if ((com == 0 && user == 0) || (com == 1 && user == 1) || (com == 1 && user == 1))
			System.out.println("비겼습니다");
		
		if ((com == 0 && user == 2) || (com == 1 && user == 0) || (com == 2 && user == 1))
			System.out.println("졌습니다");
		
		if ((com == 2 && user == 0) || (com == 0 && user == 1) || (com == 1 && user == 2))
			System.out.println("이겼습니다");*/
		
		if (result == -2 || result == 1)
			System.out.println("졌습니다");
		if (result == 2 || result == -1)
			System.out.println("이겼습니다");
		if (result == 0)
			System.out.println("비겼습니다");
		
		scanner.close();

	}

}
