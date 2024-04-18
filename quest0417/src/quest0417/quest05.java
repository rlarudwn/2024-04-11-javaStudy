package quest0417;

import java.util.Scanner;

public class quest05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if (num <= 100 && num >= 90)
			System.out.println("A학점입니다");
		if (num < 90 && num >= 80)
			System.out.println("B학점입니다");
		if (num < 80 && num >= 70)
			System.out.println("C학점입니다");
		if (num < 70 && num >= 60)
			System.out.println("D학점입니다");
		if (num < 60)
			System.out.println("F학점입니다");
		
		scanner.close();
	}

}
