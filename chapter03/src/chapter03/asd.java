package chapter03;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {

		int num_1, num_2;
		Scanner scanner = new Scanner(System.in);
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		if(num_2 != 0)
			System.out.printf("%d", num_1 % num_2);
		else
			System.out.println("0으로 나눌 수 없습니다");


	}

}
