package chapter02_3;

import java.util.Scanner;
/*
 	C			=> #include
 	C#			=> using
 	Python		=> import
 	JavaScript	=> import
 	기존에 만들어져 있는 클래스를 불러온다, 라이브러리 읽기
 	같은 폴더에 있는 경우 생략	=> 다른 폴더에 있는 경우에만 호출
 */

public class 연산자_입력값처리 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, math, eng, total;
		double avg;
		
		System.out.print("국어, 영어, 수학 점수 입력 (50 60 70) : ");
		//System.out.print("국어점수 입력 : ");
		kor = scanner.nextInt();
		//System.out.print("영어점수 입력 : ");
		eng = scanner.nextInt();
		//System.out.print("수학점수 입력 : ");
		math = scanner.nextInt();
		total = kor + eng + math;
		avg = total / 3.;
		
		System.out.println("=========== 결과 ===========");
		System.out.printf("국어 : %d점 영어 : %d점 수학 : %d점\n총점 : %d 평균 : %.3f", kor, eng, math, total, avg);


	}

}
