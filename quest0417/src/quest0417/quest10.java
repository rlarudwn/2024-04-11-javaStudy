package quest0417;

import java.util.Scanner;

public class quest10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int num = scanner.nextInt();

		if (num == 1 || num == 2 || num == 12)
			System.out.println("겨울");
		else if (num >= 3 && num <= 5)
			System.out.println("봄");
		else if (num >= 6 && num <= 8)
			System.out.println("여름");
		else if (num >= 9 && num <= 11)
			System.out.println("겨울");
		else
			System.out.println("1 ~ 12 정수를 입력해주세요");


		switch (num) {
		case 3:
		case 4:
		case 5:	System.out.println("봄");
		break;
		case 6:
		case 7:
		case 8: System.out.println("여름");
		break;
		case 9:
		case 10:
		case 11:System.out.println("가을");
		break;
		case 12:
		case 1:
		case 2:	System.out.println("겨울");
		break;
		default:
			System.out.println("1 ~ 12 정수를 입력해주세요");
		break;
		}
		scanner.close();
	}

}
