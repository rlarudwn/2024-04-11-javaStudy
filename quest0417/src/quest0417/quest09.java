package quest0417;

import java.util.Scanner;

public class quest09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리정수 입력 : ");
		int num = scanner.nextInt();
		if (num < 10 || num >= 100)
			System.out.println("두자리 정수를 입력해주세요");
		else
			if(num % 11 == 0)
				System.out.println("10의 자리와 1의 자리가 같습니다");
			else
				System.out.println("10의 자리와 1의 자리가 다릅니다");
		
		scanner.close();
	}

}
