package quest0420;

import java.util.Scanner;

public class quest11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
