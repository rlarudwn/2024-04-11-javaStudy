//   출력형식
/*
 		System.out.println();
 						=> ln => new Line
 		System.out.println("Hello");
 		System.out.println("java");
 		Hello
 		java
		System.out.print();		==> 옆으로 출력
		System.out.print("Hello ");
		System.out.print("java");
		Hello java
		System.out.printf();	==> 서식이 있는 출력
		%d	=>	정수
		%f	=>	실수
		%c	=>	문자
		%s	=>	문자열
		자바에서 표현법
		정수 표현법	
			=>	10진법
			=>	8진법		앞에 0을 붙임
			=>	16진법	앞에 0x를 붙임		=> 색상코드
			=>	2진법		앞에 0b를 붙임
		==========================================
		10	=>	32bit	=>	int
		10L	=>	64bit	=>	long
		실수 표현법		=>	저장하는 메모리 크기		10.5	=> 32bit	(4byte)		1byte => 8bit
											10.5f 	=> 64bit			
								
		문자 표현법		=>	'A'
		문자열 표현법	=>	"Hello"

 */

import java.util.Date;

public class MainClass2 {

	public static void main(String[] args) {
		
		//System.out.println("\"홍길동\"");
		//System.out.println("c:\\javaDev\\movie.txt");
		//System.out.println("홍길동\n남자");
		//System.out.print("홍길동\t");
		//System.out.print("남자\t");
		//System.out.print("26");
		
		
		/*
		 * for(int i = 1 ; i <= 5 ; i++) { for(int j = 1 ; j <= 6-i ; j ++)
		 * System.out.print("*"); System.out.println(); }
		 */
		  System.out.printf("%-3d%-3d%-3d%-3d%-3d", 10, 20, 30, 40, 50);
		 
		

	}

}
