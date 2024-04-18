package chapter03_2;

import java.util.Scanner;

public class 제어문_조건문_07 {

	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		char score = 'F';
		
		Scanner	scanner = new Scanner(System.in);
		System.out.print("국영수 순으로 성적을 입력해주세요 (50 90 60) : ");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		total = kor + eng + math;
		avg = total / 3.0;
		
		if (avg >= 90 && avg <= 100)
			score = 'A';
		else if (avg >= 80)
			score = 'B';
		else if (avg >= 70)
			score = 'C';
		else if (avg >= 60)
			score = 'D';
		else if (avg < 60)
			score = 'F';
		else
			System.out.println("점수 입력이 잘못되었습니다");
		
		System.out.printf("국어 : %d점 수학 : %d점 영어 : %d점", kor, eng, math);
		System.out.printf("총점 : %d점 평균 :  %.2f점 학점 : %c", total, avg, score);
		
	}

}
