package quest0417;

import java.util.Scanner;

public class quest01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		if(num < 0)
			System.out.println(num + "는(은) 음수입니다");
		else
			System.out.println(num + "는(은) 양수입니다");
		
		scanner.close();
	}

}
