package quest0417;

import java.util.Scanner;

public class quest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		if (num % 3 == 0)
			System.out.println(num + "는(은) 3의 배수입니다.");
		else
			System.out.println(num + "는(은) 3의 배수가 아닙니다.");
		
		scanner.close();
	}

}
