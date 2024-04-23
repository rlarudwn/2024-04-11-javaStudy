package chapter03_5;

import java.util.Scanner;

public class 자바제어문_반복문_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char score = 'F';
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.print(i + "번째 학생의 국어 영어 수학 순으로 성적을 입력해 주세요 : (10 20 30)");
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			int math = scanner.nextInt();
			int total = kor + eng + math;
			double avg = total / 3.0;
			if(avg >= 90)
				score = 'A';
			else if(avg >= 80)
				score = 'B';
			else if(avg >= 70)
				score = 'C';
			else if(avg >= 60)
				score = 'D';
			else
				score = 'F';
			System.out.println(i + "번째 학생 성적");
			System.out.printf("국어 : %d점  영어 : %d점  수학 : %d점\n", kor, eng, math);
			System.out.printf("총점 : %d점  평균 : %.2f점  학점 : %c\n", total, avg, score);
		}
	}

}
