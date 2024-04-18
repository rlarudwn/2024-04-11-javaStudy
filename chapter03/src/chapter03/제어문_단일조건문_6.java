package chapter03;

import java.util.Scanner;

public class 제어문_단일조건문_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int kor , math, eng, total;
		double avg;
		char score = 0;
		
		System.out.print("국어 영어 수학 점수를 입력해주세요 (50 60 70) : ");
		
		kor = scanner.nextInt();
		math = scanner.nextInt();
		eng = scanner.nextInt();
		
		total = kor + math + eng;
		avg = total / 3.0;
		
		if (avg >= 90 && avg < 100)
			score = 'A';
		if (avg >= 80 && avg < 90)
			score = 'B';
		if (avg >= 70 && avg < 80)
			score = 'C';
		if (avg >= 60 && avg < 70)
			score = 'D';
		if (avg < 60)
			score = 'F';
		
		System.out.printf("국어 : %d점 영어 : %d점 수학 : %d점\n", kor, eng, math);
		System.out.printf("총점 : %d점 평균 : %.2f점 학점 : %s", total, avg, score);
		scanner.close();

	}

}
