package quest0417;

import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		if (num < 0)
			num *= -1;
		num = Math.abs(num);
		System.out.println("a="+num);

		scanner.close();
	}

}
