package chapter03_while_1;

import java.util.Scanner;

public class 자바제어문_반복문_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 음악 목록");
			System.out.println("2. 음악 검색(곡명)");
			System.out.println("3. 음악 검색(가수명)");
			System.out.println("4. 음악 보기");
			System.out.println("9. 프로그램 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택: ");
			int menu = scanner.nextInt();
			/*if(menu == 1) {
				System.out.println("음악 전체 목록을 요청하셨습니다");
			}
			else if(menu == 2) {
				System.out.println("노래명으로 검색을 요청하셨습니다");				
			}
			else if(menu == 3) {
				System.out.println("가수명으로 검색을 요청하셨습니다");
			}
			else if(menu == 4) {
				System.out.println("동영상을 요청하셨습니다");
			}
			else if(menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println("존재하지 않는 메뉴입니다");
			}*/
			switch(menu) {
			case 1:
				System.out.println("음악 전체 목록을 요청하셨습니다");
				break;
			case 2:
				System.out.println("노래명으로 검색을 요청하셨습니다");				
				break;
			case 3:
				System.out.println("가수명으로 검색을 요청하셨습니다");
				break;
			case 4:
				System.out.println("동영상을 요청하셨습니다");
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.println("존재하지 않는 메뉴입니다");
				break;
			}
		}
	}

}
